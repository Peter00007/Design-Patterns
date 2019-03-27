package com.patterns.behavioral.memento;


public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project. V.1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current project to github");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating project to V.1.1");

        project.setVersionAndDate("V.1.1");

        System.out.println(project);

        System.out.println("Rolling back to V.1.0");
        project.load(gitHubRepo.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}

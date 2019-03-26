package com.patterns.structural.proxy;


public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/Peter00007");

        project.run();
    }
}

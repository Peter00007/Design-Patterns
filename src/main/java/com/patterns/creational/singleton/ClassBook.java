package com.patterns.creational.singleton;


public class ClassBook {
    private static ClassBook classBook;
    private static String infoFile = "This is info file. \n\n";

    public static synchronized ClassBook getClassBook() {
        if (classBook == null) {
            classBook = new ClassBook();
        }

        return classBook;
    }

    private ClassBook() {
    }

    public void addStudentInfo (String studentInfo) {
        infoFile += studentInfo + "\n";
    }

    public void showInfoFile() {
        System.out.println(infoFile);
    }

}

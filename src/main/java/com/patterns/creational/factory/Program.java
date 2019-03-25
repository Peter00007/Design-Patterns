package main.java.com.patterns.creational.factory;





public class Program {
    public static void main(String[] args) {
        UniversityStaffFactory universityStaffFactory = createUniversityStaffFactoryBySpecialty("teachers");
        UniversityStaff universityStaff = universityStaffFactory.createStaff();
        universityStaff.writeActivity();
    }

    static UniversityStaffFactory createUniversityStaffFactoryBySpecialty (String specialty) {
        if (specialty.equalsIgnoreCase("students")) {
            return new StudentsUniversityFactory();
        }
        if (specialty.equalsIgnoreCase("teachers")) {
            return new TeachersUniversityFactory();
        }
        else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}

package main.java.com.patterns.creational.factory;

/**
 * Created by User on 25.03.2019.
 */
public class StudentsUniversityFactory implements UniversityStaffFactory{
    @Override
    public UniversityStaff createStaff() {
        return new Students();
    }
}

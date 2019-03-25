package main.java.com.patterns.creational.factory;

/**
 * Created by User on 25.03.2019.
 */
public class TeachersUniversityFactory implements UniversityStaffFactory{
    @Override
    public UniversityStaff createStaff() {
        return new Teachers();
    }
}

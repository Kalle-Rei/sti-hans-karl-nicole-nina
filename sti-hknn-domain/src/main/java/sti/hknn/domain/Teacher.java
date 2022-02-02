package sti.hknn.domain;

import java.util.ArrayList;

public class Teacher extends Person{

    private int hourlyWage;

    public Teacher(String firstName, String lastName, String personalId, ArrayList<Course> courseList, int hourlyWage) {
        super(firstName, lastName, personalId, courseList);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", hourlyWage=" + hourlyWage +
                '}';
    }
}

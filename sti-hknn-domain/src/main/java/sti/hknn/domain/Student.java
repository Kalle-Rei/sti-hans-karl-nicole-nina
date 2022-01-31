package sti.hknn.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private String computer;

    public Student(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer) {
        super(firstName, lastName, personalId, courseList);
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", courseList=" + courseList +
                ", computer='" + computer + '\'' +
                '}';
    }
}

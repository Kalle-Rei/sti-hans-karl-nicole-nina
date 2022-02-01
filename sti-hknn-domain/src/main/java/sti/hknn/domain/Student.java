package sti.hknn.domain;

import java.util.ArrayList;

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
                "\nfirstName='" + firstName + '\'' +
                ",\n lastName='" + lastName + '\'' +
                ",\n personalId='" + personalId + '\'' +
                ",\n courseList=" + courseList +
                ",\n computer='" + computer + '\'' +
                '}';
    }
}

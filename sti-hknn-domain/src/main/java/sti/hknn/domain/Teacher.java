package sti.hknn.domain;

import java.util.ArrayList;

public class Teacher extends Person{

    private int hourlyWage;

    public Teacher(String firstName, String lastName, String personalId, ArrayList<Course> courseList, int hourlyWage) {
        super(firstName, lastName, personalId, courseList);
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}

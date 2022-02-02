package sti.hknn.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String personalId;
    protected ArrayList<Course> courseList;

    public Person(String firstName, String lastName, String personalId, ArrayList<Course> courseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.courseList = courseList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalId='" + personalId + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}

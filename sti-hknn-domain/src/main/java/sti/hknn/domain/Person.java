package sti.hknn.domain;

import java.util.List;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String personalId;
    protected List<Course> courseList;

    public Person(String firstName, String lastName, String personalId, List<Course> courseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.courseList = courseList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}

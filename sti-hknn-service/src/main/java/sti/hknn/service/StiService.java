package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import java.util.ArrayList;

public interface StiService {

    void init();

    Student getStudent(String personalId);
    String printStudentInfo(Student student);
    void addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer);
    Course getCourse(String courseId);
    void addCourse(Student student, Course course);
    void removeCourse(Student student, String courseId);

    //Menu handlers
    void printMenu();
    void printCourses(Student student);
    boolean menuChoice(int choice);

}

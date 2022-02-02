package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Teacher;

import java.util.ArrayList;

public interface StiService {


    Student getStudent(String personalId);
    Student addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer);
    void addCourse(Student student, int credits, Teacher teacher, String courseId, int courseHours);
    void removeCourse(Student student, String courseId);

}

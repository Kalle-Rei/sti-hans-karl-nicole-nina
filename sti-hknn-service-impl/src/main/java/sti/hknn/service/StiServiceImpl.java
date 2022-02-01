package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Teacher;

import static sti.hknn.domain.Vault.students;

import java.util.ArrayList;

public class StiServiceImpl implements StiService{

    //kan tänkas vilja ändra denna till att returnera en Student istället och sköta outputen från Main eller annan metod
    @Override
    public String getStudent(String personalId) {
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                return student.getFirstName() + " " + student.getLastName() + ", " + student.getCourseList();
            }
        }

        return "Det finns ingen student med ID " + personalId + ".";
    }

    @Override
    public Student addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer) {
        return new Student(firstName, lastName, personalId, courseList, computer);
    }

    @Override
    public void addCourse(Student student, int credits, Teacher teacher, String courseId, int courseHours) {
        Course course = new Course(credits, teacher, courseId, courseHours);
        student.addCourse(course);
    }

    @Override
    public void removeCourse(Student student, String courseId) {
        for(Course course: student.getCourseList()){
            if(courseId.equalsIgnoreCase(course.getCourseId())){
                student.removeCourse(course);
            }
        }
    }
}

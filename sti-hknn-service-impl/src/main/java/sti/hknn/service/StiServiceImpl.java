package sti.hknn.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Teacher;

import static sti.hknn.domain.Vault.students;

import java.util.ArrayList;

public class StiServiceImpl implements StiService{
    private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);

    @Override
    public Student getStudent(String personalId){
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                LOGGER.trace("student found");
                return student;
            }
        }
        LOGGER.trace("Incorrect personalId. Student not found");
        return null;
    }

    @Override
    public Student addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer) {
        LOGGER.trace("new student has been added");
        return new Student(firstName, lastName, personalId, courseList, computer);
    }

    //Lägg till try-catch för credits och courseHours
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

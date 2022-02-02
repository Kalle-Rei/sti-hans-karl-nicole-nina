package sti.hknn.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Vault;

import static sti.hknn.domain.Vault.courseList;
import static sti.hknn.domain.Vault.students;

import java.util.ArrayList;
import java.util.Scanner;

public class StiServiceImpl implements StiService{
    static Scanner s = new Scanner(System.in);
    private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);
    //@TODO: check LOGGER's functionality and possibly log more events

    @Override
    public void init(){
        LOGGER.trace("loaded dummy values");
        Vault.createTeachers();
        students = Vault.createStudentList();
        boolean running = true;

        while(running){
            printMenu();
            running = menuChoice(s.nextInt());
        }
        s.close();
    }

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
    public Course getCourse(String courseId){
        for(Course course: courseList){
            if(course.getCourseId().equalsIgnoreCase(courseId)){
                LOGGER.trace("course found");
                return course;
            }
        }
        LOGGER.trace("Incorrect courseId. Course not found");
        return null;
    }

    @Override
    public String printStudentInfo(Student student){
        String output = student.getFirstName() + " " + student.getLastName() + ",\n";
        for (Course course: student.getCourseList()){
            output += course.getCourseId() + " ";
        }
        return output;
    }

    @Override
    public void addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer) {
        LOGGER.trace("new student has been added");
        Student newStudent = new Student(firstName, lastName, personalId, courseList, computer);
        students.add(newStudent);
    }

    @Override
    public void addCourse(Student student, Course course){
        LOGGER.trace("course added to student");
        student.addCourse(course);
    }

    @Override
    public void removeCourse(Student student, String courseId) {
        String courseToRemove = "";
        for(Course course: student.getCourseList()){
            if(courseId.equalsIgnoreCase(course.getCourseId())){
                courseToRemove += course.getCourseId();
                System.out.println("Course removed.");
                LOGGER.trace("course removed from student");
            }
        }
        student.removeCourse(getCourse(courseToRemove));
    }

    @Override
    public void printMenu(){
        System.out.println("MENU:");
        System.out.println("1. Get a student via personal id.");
        System.out.println("2. Add new student.");
        System.out.println("3. Add or remove course for a given student.");
        System.out.println("0. Exit.");
    }

    @Override
    public void printCourses(Student student){
        for(Course course : student.getCourseList()){
            System.out.println(course.getCourseId());
        }
    }

    @Override
    public boolean menuChoice(int choice){
        //@TODO: handle exceptions when inputting invalid personalId
        switch (choice){

            case 1:{ //Get a student via personalId
                s.nextLine();
                System.out.println("Enter personal id: ");
                String personalId = s.nextLine();
                System.out.println(printStudentInfo(getStudent(personalId)));
                break;

            }

            case 2:{ //Add new student
                ArrayList<Course> courses = new ArrayList<>();
                s.nextLine();
                System.out.println("Enter first name: ");
                String firstName = s.nextLine();
                System.out.println("Enter last name: ");
                String lastName = s.nextLine();
                System.out.println("Enter personal id: ");
                String personalId = s.nextLine();
                System.out.println("Enter computer brand: ");
                String computer = s.nextLine();
                addStudent(firstName, lastName, personalId, courses, computer);
                break;

            }
            case 3:{ //Add or remove course for a given student
                s.nextLine();
                System.out.println("Enter personal id: ");
                String personalId = s.nextLine();
                System.out.println("1. Add a new course");
                System.out.println("2. Remove a course");
                int choice2 = s.nextInt();
                s.nextLine();
                switch(choice2){
                    case 1:{
                        System.out.println("\nSelect a course: ");
                        //print all courses in courseList NOT in student.courseList
                        for(Course course: courseList){
                            if(!getStudent(personalId).getCourseList().contains(course)){
                                System.out.println(course.getCourseId());
                            }
                        }
                        String inputCourse = s.nextLine();
                        addCourse(getStudent(personalId), getCourse(inputCourse));
                        System.out.println("Course added.");
                        System.out.println(printStudentInfo(getStudent(personalId)));
                        break;
                    }
                    case 2:{
                        //print all courses in student.courseList
                        System.out.println("\nSelect a course: ");
                        printCourses(getStudent(personalId));
                        String inputCourse = s.nextLine();
                        removeCourse(getStudent(personalId), inputCourse);
                        System.out.println(printStudentInfo(getStudent(personalId)));
                        break;
                    }
                }

                break;
            }
            case 0:{
                System.out.println("Exiting the program.");
                return false;
            }
            default:{
                return false;
            }
        }
        return true;
    }
}

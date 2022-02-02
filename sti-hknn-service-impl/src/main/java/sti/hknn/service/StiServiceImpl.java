package sti.hknn.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Teacher;
import sti.hknn.domain.Vault;

import static sti.hknn.domain.Vault.courseList;
import static sti.hknn.domain.Vault.students;

import java.util.ArrayList;
import java.util.Scanner;

public class StiServiceImpl implements StiService{
    static Scanner s = new Scanner(System.in);
    private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);

    @Override
    public void init(){
        Vault.createTeachers();
        students = Vault.createStudentList();
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

    @Override
    public void printMenu(){
        System.out.println("MENU:");
        System.out.println("1. Get a student via personal id.");
        System.out.println("2. Add new student.");
        System.out.println("3. Add or remove course for a given student.");
        System.out.println("4. Print all students and courses.");
        System.out.println("0. Exit.");
    }

    @Override
    public void printCourses(Student student){
        int i = 1;
        for(Course course : student.getCourseList()){
            System.out.println(i++ + ". " + course.getCourseId());
        }
    }

    @Override
    public void menuChoice(int choice){

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
                        for(Course course: courseList){
                            if(!getStudent(personalId).getCourseList().contains(course)){
                                System.out.println(course.getCourseId());
                            }
                        }
                        break;
                    }
                    case 2:{
                        printCourses(getStudent(personalId));
                        break;

                    }
                }

                break;
            }
            case 4:{ //Print all students and courses
                break;

            }
            case 0:{ //Exit
                break;

            }
            default:{
                break;

            }
        }
    }
    //@TODO: finish refactoring and test this
    @Override
    public void addNewCourse(String personalId){ //int credits, Teacher teacher, String courseId, int courseHours
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                System.out.println("Enter credits: ");
                int credits = s.nextInt();
                System.out.println("Enter course id: ");
                s.nextLine();
                String courseId = s.nextLine();
                System.out.println("Enter number of hours: ");
                int courseHours = s.nextInt();
                s.nextLine();
                //Course newCourse = StiServiceImpl.addCourse(student, credits, teacher1, courseId, courseHours);
            }
        }


    }

}

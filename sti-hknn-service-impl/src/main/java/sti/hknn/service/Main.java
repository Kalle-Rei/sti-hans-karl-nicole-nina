package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Vault;

import java.util.Scanner;

import static sti.hknn.domain.Vault.students;
import static sti.hknn.domain.Vault.teacher1;

public class Main {
    private StiService stiService;
    static Scanner s = new Scanner(System.in);


    public Main(StiService stiService){
        this.stiService = stiService;
    }
    public Main(){

    }
    public static void main(String[] args) {
        Main main = new Main(new StiServiceImpl());
        //main.stiService.addCourse(); //<----- use this pattern to access methods in ServiceImpl
        //main.printMenu();
        students = Vault.createStudentList();
        //System.out.println(students.toString());
        System.out.println(main.stiService.getStudent("9302116565"));



    }

    //@TODO: move these methods to Service
    public void printMenu(){
        System.out.println("MENU:");
        System.out.println("1. Get a student via personalId.");
        System.out.println("2. Add new student.");
        System.out.println("3. Add or remove course for a given student.");
        System.out.println("4. Print all students and courses.");
        System.out.println("0. Exit.");
    }

    public void menuChoice(int choice){

        switch (choice){

            case 1:{ //Get a student via personalId
                //@TODO: print instructions to the user
                s.nextLine();
                String input = s.nextLine();
                //System.out.println(StiServiceImpl.getStudent(input));
                System.out.println();

            }
            case 2:{ //Add new student
                s.nextLine();
                System.out.println("Enter first name: ");
                String firstName = s.nextLine();
                System.out.println("Enter last name: ");
                String lastName = s.nextLine();
                System.out.println("Enter personal id: ");
                String personalId = s.nextLine();
                System.out.println("Enter computer brand: ");
                String computer = s.nextLine();
                //Student newStudent = StiServiceImpl.addStudent(firstName, lastName, personalId, Vault.createCourseList(), computer);
                //students.add(newStudent);



            }
            case 3:{ //Add or remove course for a given student
                System.out.println("Enter personalId: ");
                String personalId = s.nextLine();
                System.out.println("1. Add a new course");
                System.out.println("2. Remove a course");
                int choice2 = s.nextInt();
                s.nextLine();
                switch(choice2){
                    case 1:{
                        addNewCourse(personalId);
                    }
                    case 2:{

                    }
                }


            }
            case 4:{ //Print all students and courses

            }
            case 0:{ //Exit

            }
            default:{

            }
        }
    }
    //@TODO: refactor the static away
    public static void addNewCourse(String personalId){ //int credits, Teacher teacher, String courseId, int courseHours
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                System.out.println("Enter credits: ");
                int credits = s.nextInt();
                System.out.println("Enter courseId: ");
                s.nextLine();
                String courseId = s.nextLine();
                System.out.println("Enter courseHours: ");
                int courseHours = s.nextInt();
                s.nextLine();
                //Course newCourse = StiServiceImpl.addCourse(student, credits, teacher1, courseId, courseHours);
            }
        }


    }
}

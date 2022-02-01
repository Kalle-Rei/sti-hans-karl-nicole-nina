package sti.hknn.service;

import sti.hknn.domain.Student;
import sti.hknn.domain.Vault;

import java.util.Scanner;

import static sti.hknn.domain.Vault.students;
public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        students = Vault.createStudentList();
        //System.out.println(students.toString());

        printMenu();
        //menuChoice(s.nextInt());



    }

    public static void printMenu(){
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
                System.out.println(StiServiceImpl.getStudent(input));

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



            }
            case 3:{ //Add or remove course for a given student

            }
            case 4:{ //Print all students and courses

            }
            case 0:{ //Exit

            }
            default:{

            }
        }
    }
}

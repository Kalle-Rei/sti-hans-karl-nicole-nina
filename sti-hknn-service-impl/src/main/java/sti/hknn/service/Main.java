package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Vault;

import java.util.ArrayList;
import java.util.Scanner;

import static sti.hknn.domain.Vault.*;

public class Main {
    private StiService stiService;



    public Main(StiService stiService){
        this.stiService = stiService;
    }
    public Main(){

    }
    public static void main(String[] args) {
        Main main = new Main(new StiServiceImpl());
        main.stiService.init();
//        Vault.createTeachers();
//        students = Vault.createStudentList();

        //Test stuff below
        main.stiService.printMenu();
        //main.stiService.addStudent("Test", "Testat", "5555", courseList, "computer");
//        System.out.println(main.stiService.printStudentInfo(main.stiService.getStudent("5555")));
//        System.out.println(main.stiService.getStudent("2222"));
        main.stiService.printCourses(main.stiService.getStudent("2222"));
        main.stiService.menuChoice(3);
        //System.out.println(main.stiService.getStudent("6666"));


    }
}

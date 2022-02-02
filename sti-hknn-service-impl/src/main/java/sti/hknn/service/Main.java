package sti.hknn.service;

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import sti.hknn.domain.Vault;

import java.util.Scanner;

import static sti.hknn.domain.Vault.students;
import static sti.hknn.domain.Vault.teacher1;

public class Main {
    private StiService stiService;



    public Main(StiService stiService){
        this.stiService = stiService;
    }
    public Main(){

    }
    public static void main(String[] args) {
        Main main = new Main(new StiServiceImpl());
        students = Vault.createStudentList();
        //Test stuff below
        main.stiService.printMenu();
        System.out.println(main.stiService.printStudentInfo(main.stiService.getStudent("3333")));

    }
}

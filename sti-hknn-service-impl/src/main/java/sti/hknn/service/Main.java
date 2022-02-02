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

        //Test stuff below
        main.stiService.printMenu();
        main.stiService.printCourses(main.stiService.getStudent("2222"));
        main.stiService.menuChoice(3);


    }
}

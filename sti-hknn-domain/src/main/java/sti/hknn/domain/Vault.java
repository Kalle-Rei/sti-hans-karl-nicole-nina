package sti.hknn.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vault {
    static ArrayList<Student> students;
   static ArrayList<Course> courseList = new ArrayList<Course>();

    public static void createStudents(){
        students.add(new Student("Kalle", "Reithmeier", "9302116565", courseList, "Acer"));
        students.add(new Student("Hans ", "Davidsson", "", courseList, "Acer"));
        students.add(new Student("Kalle", "Reithmeier", "9302116565", courseList, "Acer"));
        students.add(new Student("Kalle", "Reithmeier", "9302116565", courseList, "Acer"));

    }
}

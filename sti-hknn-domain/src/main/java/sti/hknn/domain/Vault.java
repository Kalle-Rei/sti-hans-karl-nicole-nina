package sti.hknn.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vault {
    public static ArrayList<Course> courseList = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();


    public static ArrayList<Student> createStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(addStudent("Kalle", "Reithmeier", "9302116565", createCourseList(), "Acer"));
        studentList.add(new Student("Kalle", "Reithmeier", "9302116565", createCourseList(), "Acer"));
        studentList.add(new Student("Hans ", "Davidsson", "", createCourseList(), "Acer"));
        studentList.add(new Student("Kalle", "Reithmeier", "9302116565", createCourseList(), "Acer"));
        studentList.add(new Student("Kalle", "Reithmeier", "9302116565", createCourseList(), "Acer"));

        return studentList;
    }


    public static ArrayList<Course> createCourseList(){
        ArrayList<Course> courseList1 = new ArrayList<Course>();
        Teacher teacher1 = new Teacher("Kisslo", "Shek", "8585851234", courseList, 250);
        courseList1.add(new Course(20, teacher1, "HTML", 200));
        Teacher teacher2 = new Teacher("Özgür", "Kibar", "8585851234", courseList, 300);
        courseList1.add(new Course(25, teacher2, "JAVAB", 500000000));
        return courseList1;
    }
}

package sti.hknn.domain;

import java.util.ArrayList;

public class Vault {
    public static ArrayList<Course> courseList = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    //@TODO: change this hacky solution to a less hacky one -- see also createCourseList
    public static Teacher teacher1 = new Teacher("Kisslo", "Shek", "8585851234", courseList, 250);
    public static Teacher teacher2 = new Teacher("Özgür", "Kibar", "8585851234", courseList, 300);


    public static ArrayList<Student> createStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kalle", "Reithmeier", "1111", createCourseList(), "Acer"));
        studentList.add(new Student("Hans ", "Davidsson", "2222", createCourseList(), "Mac"));
        studentList.add(new Student("Nicole", "Silfverling", "3333", createCourseList(), "Mac"));
        studentList.add(new Student("Nina", "Odelius", "4444", createCourseList(), "HP"));

        return studentList;
    }


    public static ArrayList<Course> createCourseList(){
        ArrayList<Course> courseList1 = new ArrayList<Course>();
        //Teacher teacher1 = new Teacher("Kisslo", "Shek", "8585851234", courseList, 250);
        courseList1.add(new Course(20, teacher1, "HTML", 200));
        //Teacher teacher2 = new Teacher("Özgür", "Kibar", "8585851234", courseList, 300);
        courseList1.add(new Course(25, teacher2, "JAVAB", 500000000));
        return courseList1;
    }
}

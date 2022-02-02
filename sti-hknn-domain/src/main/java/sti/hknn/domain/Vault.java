package sti.hknn.domain;

import java.util.ArrayList;

public class Vault {
    public static ArrayList<Course> courseList = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    public static Teacher teacher1 = new Teacher("Kisslo", "Shek", "123", courseList, 450);
    public static Teacher teacher2 = new Teacher("Özgür", "Kibar", "456", courseList, 600);
    public static Teacher teacher3 = new Teacher("Mikael", "Wallin", "789", courseList, 550);
    public static Course course1 = new Course(20, teacher1, "HTML", 200);
    public static Course course2 = new Course(25, teacher2, "JAVAB", 300);
    public static Course course3 = new Course(25, teacher3, "Databashantering", 300);




    public static ArrayList<Student> createStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kalle", "Reithmeier", "1111", createCourseList(), "Acer"));
        studentList.add(new Student("Hans ", "Davidsson", "2222", createCourseList(), "Mac"));
        studentList.add(new Student("Nicole", "Silfverling", "3333", createCourseList(), "Mac"));
        studentList.add(new Student("Nina", "Odelius", "4444", createCourseList(), "HP"));

        return studentList;
    }

    public static void createTeachers(){
        teacher1.addCourse(course1);
        teacher2.addCourse(course2);
        teacher3.addCourse(course3);
    }

    public static ArrayList<Course> createCourseList(){
        ArrayList<Course> courseList1 = new ArrayList<Course>();
        courseList1.add(course1);
        courseList1.add(course2);
        return courseList1;
    }
}

package sti.hknn.service;

//Projektets Service skall kunna:
//1. hämta en Student med personnummer som input.
//Studentens förnamn, efternamn och kursnamn skall skrivas ut.
//2. Lägga till en Student genom att anropa constructorn
//3. Lägga till/ta bort kurser för en Student

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;

import java.util.ArrayList;

public interface StiService {

    Student getStudent(String personalId);
    Student addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer);
    Student addCourse();
}

package sti.hknn.service;

//Projektets Service skall kunna:
//1. hämta en Student med personnummer som input.
//Studentens förnamn, efternamn och kursnamn skall skrivas ut.
//2. Lägga till en Student genom att anropa constructorn
//3. Lägga till/ta bort kurser för en Student

import sti.hknn.domain.Course;
import sti.hknn.domain.Student;
import static sti.hknn.domain.Vault.students;

import java.util.ArrayList;

public class StiServiceImpl implements StiService{
    @Override
    public String getStudent(String personalId) {
        for(Student student: students){
            if(student.getPersonalId().equalsIgnoreCase(personalId)){
                return student.getFirstName() + " " + student.getLastName() + ", " + student.getCourseList();
            }
        }

        return "Det finns ingen student med ID " + personalId + ".";
    }

    @Override
    public Student addStudent(String firstName, String lastName, String personalId, ArrayList<Course> courseList, String computer) {
        return null;
    }

    @Override
    public Student addCourse() {
        return null;
    }
}

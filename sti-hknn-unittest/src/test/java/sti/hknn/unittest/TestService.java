package sti.hknn.unittest;

import org.junit.Assert;
import org.junit.Test;
import sti.hknn.domain.Course;
import sti.hknn.domain.Student;

import java.util.ArrayList;

public class TestService {
    @Test
    public void studentConstructorTest() {
        ArrayList<Course> courseList = new ArrayList<>();
        Student student = new Student("firstName", "lastName", "personalId", courseList, "computer");
        Assert.assertEquals("firstName", student.getFirstName());
    }

}

package sti.hknn.unittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sti.hknn.domain.Student;
import sti.hknn.service.StiService;

import static sti.hknn.domain.Vault.courseList;

public class TestService {
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:sti-hknn-service.xml");
    private StiService stiService;
    @Test
    public void studentConstructorTest() {
        Student student = new Student("firstName", "lastName", "personalId", courseList, "computer");
        Assert.assertEquals("firstName", student.getFirstName());
    }

//    @Before
//    public void Before(){
//        stiService = (StiService) applicationContext.getBean("stiService");
//    }
//    @Test
//    public void studentConstructorTest2(){
//        Student student = stiService.addStudent("firstName", "lastName", "personalId", courseList, "computer");
//        Assert.assertNotNull(student);
//    }

}

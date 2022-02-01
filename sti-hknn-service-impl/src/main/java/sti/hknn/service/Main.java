package sti.hknn.service;

import sti.hknn.domain.Vault;

import java.util.ArrayList;

import static sti.hknn.domain.Vault.students;
public class Main {

    public static void main(String[] args) {

        students = Vault.createStudentList();
        System.out.println(students.toString());




    }
}

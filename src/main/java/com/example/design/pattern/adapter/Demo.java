package com.example.design.pattern.adapter;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> ls = studentClient.getStudentList();
        System.out.println(ls);
    }
}

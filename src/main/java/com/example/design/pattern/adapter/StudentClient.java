package com.example.design.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("siddharth","neekhra",20);
        SchoolStudent schoolStudent = new SchoolStudent("sid","gupta",23);
        studentList.add(collegeStudent);
        studentList.add(new StudentAdapter(schoolStudent));
        return studentList;
    }
}

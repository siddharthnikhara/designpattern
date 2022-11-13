package com.example.design.pattern.adapter;

public class StudentAdapter implements Student {
    private SchoolStudent schoolStudent;

    StudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String getLastName() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public int getAge() {
        return this.schoolStudent.getAge();
    }

    @Override
    public String toString() {
        return "StudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}

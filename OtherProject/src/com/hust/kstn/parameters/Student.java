package com.hust.kstn.parameters;

public class Student {
    private int studentId;
    private String name;

    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    void setStudentId(int id) {
        this.studentId = id;
    }

    void setName(String name) {
        this.name = name;
    }
}

package com.kawu.studio.entity;

public class Student {

    private String studentName; //学生姓名
    private long studentId;  //学生学号
    private String studentSex; //学生性别

    public Student() {
    }

    public Student(long studentId, String studentName, String studentSex) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSex=" + studentSex + "]";
    }
}

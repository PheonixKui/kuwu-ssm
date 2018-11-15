package com.kawu.studio.entity;
/**
* @author      Cloud Flying
 * 学生表对应的实体
*/
public class Student {
    private long studentId;// 学生ID

    private String name;// 学生名称

    private String school;// 学校名称

    public Student() {
    }

    public Student(long studentId, String name, String school) {
        this.studentId = studentId;
        this.name = name;
        this.school = school;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
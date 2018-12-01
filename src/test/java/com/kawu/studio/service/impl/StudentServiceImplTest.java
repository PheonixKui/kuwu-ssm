package com.kawu.studio.service.impl;

import com.kawu.studio.BaseTest;
import com.kawu.studio.entity.Student;
import com.kawu.studio.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImplTest extends BaseTest {
    @Autowired
    private StudentService studentService;
    private  Student student = new Student();

    @Test
    public void testaddStudent() throws Exception {
        student.setStudentId(1008);
        student.setStudentName("HGS");
        student.setStudentSex("男");
        studentService.addStudent(student);

    }
}

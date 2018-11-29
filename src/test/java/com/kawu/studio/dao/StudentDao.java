package com.kawu.studio.dao;

import com.kawu.studio.BaseTest;
import com.kawu.studio.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentDao extends BaseTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void testQueryById() throws Exception {
        long studentId = 1000;
        Student student = studentDao.queryById(studentId);
        System.out.print(student);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Student> students = studentDao.queryAll(0, 4);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testDeleteStudent() throws Exception{
        long studentId = 1001;
        studentDao.deleteStudent(studentId);
    }

}

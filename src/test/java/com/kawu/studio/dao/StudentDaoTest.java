package com.kawu.studio.dao;

import com.kawu.studio.BaseTest;
import com.kawu.studio.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentDaoTest extends BaseTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void testQueryById() throws Exception {
        long studentId = 1000;
        Student student = studentDao.queryById(studentId);
        System.out.println(student);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Student> students = studentDao.queryAll(0, 4);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}

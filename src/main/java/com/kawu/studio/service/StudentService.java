package com.kawu.studio.service;

import com.kawu.studio.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 根据学生id查询
     * @param studentId
     * @return
     */
    Student getById(long studentId);

    List<Student> getList();

    int addStudent(Student student);

    int deleteStudent(long studentId);

    int updateStudent(Student student);
}

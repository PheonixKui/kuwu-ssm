package com.kawu.studio.service;

import com.kawu.studio.dto.AppointExecution;
import com.kawu.studio.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 根据学生id查询
     * @param studentId
     * @return
     */
    Student getById(long studentId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Student> getList();

//    /**
//     * 预约图书
//     *
//     * @param bookId
//     * @param studentId
//     * @return
//     */
//    AppointExecution appoint(long bookId, long studentId);

    int addStudent(Student student);

    int deleteStudent(long studentId);

    int updateStudent(Student student);
}

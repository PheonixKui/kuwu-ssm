package com.kawu.studio.service.impl;

import com.kawu.studio.dao.AppointmentDao;
import com.kawu.studio.dao.StudentDao;
import com.kawu.studio.dto.AppointExecution;
import com.kawu.studio.entity.Student;
import com.kawu.studio.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @author      Cloud Flying
*/
@Service
public class StudentServiceImpl implements StudentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Student getById(long studentId) {
        return studentDao.queryById(studentId);
    }

    @Override
    public List<Student> getList() {
        return studentDao.queryAll(0,2);
    }

    @Override
    public AppointExecution appoint(long bookId, long studentId) {
        return null;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int deleteStudent(Long studentId) {
        return studentDao.deleteStudent(studentId);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}

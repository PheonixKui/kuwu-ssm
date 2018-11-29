package com.kawu.studio.service.impl;

import com.kawu.studio.dao.AppointmentDao;
import com.kawu.studio.dao.StudentDao;
import com.kawu.studio.entity.Student;
import com.kawu.studio.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao;

//    @Autowired
//    private AppointmentDao appointmentDao;

    @Override
    public Student getById(long studentId) {
        return studentDao.queryById(studentId);
    }

    @Override
    public List<Student> getList() {
        return studentDao.queryAll(0,1000);
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int deleteStudent(long studentId) {
        return studentDao.deleteStudent(studentId);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}

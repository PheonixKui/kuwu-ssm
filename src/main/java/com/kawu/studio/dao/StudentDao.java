package com.kawu.studio.dao;

import com.kawu.studio.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author      Cloud Flying
*/
public interface StudentDao {

    Student queryById(long studentId);
    /**
     * 查询所有学生信息
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Student> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    int addStudent(Student student);

    int deleteStudent(long studentId);

    int updateStudent(Student student);
}

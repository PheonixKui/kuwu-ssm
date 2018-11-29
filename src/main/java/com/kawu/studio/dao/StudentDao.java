package com.kawu.studio.dao;

import com.kawu.studio.entity.Student;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface StudentDao {
    // 五个接口：add view delete update list
    /**
     * 根据学生id查询
     * @param studentId
     * @return
     */
    Student queryById(long studentId);

    /**
     * 查询所有学生
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Student> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 根据studentid删除学生
     * @param studentId
     * @return
     */
    int deleteStudent(long studentId);

    int updateStudent(Student student);
}

package com.kawu.studio.service;

import com.kawu.studio.dto.AppointExecution;
import com.kawu.studio.entity.Student;

import java.util.List;
/**
* @author      Cloud Flying
*/
public interface StudentService {

	/**
	 * 按Id查询学生
	 * 
	 * @param studentId
	 * @return
	 */
	Student getById(long studentId);

	/**
	 * 查询所有学生
	 * 
	 * @return
	 */
	List<Student> getList();

	/**
	 * 预约图书
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);

	int addStudent(Student student);

	int deleteStudent(Long studentId);

	int updateStudent(Student student);
}

package com.kawu.studio.web;

import com.kawu.studio.dto.Result;
import com.kawu.studio.entity.Student;
import com.kawu.studio.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")         //增
    public Object add(@RequestBody Student student) {
        int result = studentService.addStudent(student);
        return new Result<>(true, result);
    }

    @GetMapping("/delete")       //删
    public Object delete(@RequestParam Long studentId) {
        int result = studentService.deleteStudent(studentId);
        return new Result<>(true, result);
    }

    @PostMapping("/update")       //改
    public Object update(@RequestBody Student student) {
        int result = studentService.updateStudent(student);
        return new Result<>(true, result);
    }

    @GetMapping("/list")          //列
    public Object list() {
        List<Student> list = studentService.getList();
        return new Result<>(true, list);
    }

    @GetMapping("/{studentId}/detail")
    public Object detail(@PathVariable("studentId") Long studentId) {
        if (studentId == null) {
            return new Result<>(false, "studentId不能为空");
        }
        Student student = studentService.getById(studentId);
        if (student == null) {
            return new Result<>(false, "student不存在");
        }
        return new Result<>(true, student);
    }
}

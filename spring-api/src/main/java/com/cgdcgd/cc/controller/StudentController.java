package com.cgdcgd.cc.controller;

import com.cgdcgd.cc.entity.Student;
import com.cgdcgd.cc.result.Result;
import com.cgdcgd.cc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public Result<List<Student>> getStudent(@RequestParam(value = "sName", required = false) String sName, @RequestParam(value = "sSex", required = false) String sSex) {

       return studentService.getStudent(sName, sSex);

    }

}

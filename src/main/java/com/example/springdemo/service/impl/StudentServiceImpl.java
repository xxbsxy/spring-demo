package com.example.springdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springdemo.result.Result;
import com.example.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springdemo.entity.Student;
import com.example.springdemo.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Result<List<Student>>  getStudent(String sName, String sSex) {
        List<Student> student =  studentMapper.getStudent(sName, sSex);

        return Result.success(student);
    }
}

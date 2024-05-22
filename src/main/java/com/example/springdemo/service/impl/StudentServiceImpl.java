package com.example.springdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springdemo.entity.Student;
import com.example.springdemo.mapper.StudentMapper;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IService<Student> {

}

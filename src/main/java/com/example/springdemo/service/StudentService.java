package com.example.springdemo.service;

import com.example.springdemo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springdemo.result.Result;

import java.util.List;

public interface StudentService extends IService<Student>{


   Result<List<Student>> getStudent(String sName, String sSex);
}

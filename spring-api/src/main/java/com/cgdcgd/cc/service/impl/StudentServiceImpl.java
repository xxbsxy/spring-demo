package com.cgdcgd.cc.service.impl;

import com.cgdcgd.cc.entity.Student;
import com.cgdcgd.cc.result.Result;
import com.cgdcgd.cc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cgdcgd.cc.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Override
    public Result<List<Student>>  getStudent(String sName, String sSex) {
        List<Student> student =  studentMapper.getStudent(sName, sSex);
        stringRedisTemplate.opsForValue().set("k2","v2");
        return Result.success(student);
    }
}

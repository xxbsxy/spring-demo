package com.example.springdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springdemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> getStudent(String sName, String sSex);
}

package com.cgdcgd.cc.service;

import com.cgdcgd.cc.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cgdcgd.cc.result.Result;

import java.util.List;

public interface StudentService extends IService<Student>{


   Result<List<Student>> getStudent( String sName, String sSex);
}

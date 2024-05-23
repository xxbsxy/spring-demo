package com.cgdcgd.cc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cgdcgd.cc.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> getStudent(@Param("sName") String sName, @Param("sSex") String sSex);
}

package com.example.springdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springdemo.entity.Student;
import com.example.springdemo.entity.Supplier;
import com.example.springdemo.result.PageResult;
import com.example.springdemo.result.Result;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {
    Result<PageResult> getSupplier();
}

package com.example.springdemo.service.impl;

import com.example.springdemo.result.PageResult;
import com.example.springdemo.result.Result;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springdemo.mapper.SupplierMapper;
import com.example.springdemo.entity.Supplier;
import com.example.springdemo.service.SupplierService;
@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService{
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public Result<PageResult> getSupplier() {
        return null;
    }
}

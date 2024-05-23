package com.example.springdemo.service;

import com.example.springdemo.entity.Supplier;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springdemo.result.PageResult;
import com.example.springdemo.result.Result;

import java.util.List;

public interface SupplierService extends IService<Supplier>{


    Result<PageResult>  getSupplier();
}

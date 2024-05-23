package com.example.springdemo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springdemo.entity.Supplier;
import com.example.springdemo.result.PageResult;
import com.example.springdemo.result.Result;
import com.example.springdemo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    SupplierService supplierService;
    @PostMapping("/suppliers")
    public Result<PageResult>  getSuppliers(){
        return supplierService.getSupplier();
    }
}

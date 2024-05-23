package com.cgdcgd.cc.controller;

import com.cgdcgd.cc.result.PageResult;
import com.cgdcgd.cc.result.Result;
import com.cgdcgd.cc.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {
    @Autowired
    SupplierService supplierService;
    @PostMapping("/suppliers")
    public Result<PageResult>  getSuppliers(){
        return supplierService.getSupplier();
    }
}

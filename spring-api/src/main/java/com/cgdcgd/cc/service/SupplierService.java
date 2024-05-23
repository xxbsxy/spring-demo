package com.cgdcgd.cc.service;

import com.cgdcgd.cc.entity.Supplier;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cgdcgd.cc.result.PageResult;
import com.cgdcgd.cc.result.Result;

public interface SupplierService extends IService<Supplier>{


    Result<PageResult>  getSupplier();
}

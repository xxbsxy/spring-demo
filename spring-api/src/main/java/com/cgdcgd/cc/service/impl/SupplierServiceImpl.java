package com.cgdcgd.cc.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cgdcgd.cc.request.SearchSupplierReq;
import com.cgdcgd.cc.result.PageResult;
import com.cgdcgd.cc.result.Result;
import com.cgdcgd.cc.utils.Utils;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cgdcgd.cc.mapper.SupplierMapper;
import com.cgdcgd.cc.entity.Supplier;
import com.cgdcgd.cc.service.SupplierService;
@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService{
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public Result<PageResult> getSupplier(SearchSupplierReq req) {
        IPage<Supplier> page = new Page<>(req.getPageNo(), req.getPageSize());
        IPage<Supplier> supplierIPage = supplierMapper.getSupplier(page, req);
        PageResult pageResult = Utils.getDefaultPageResult(supplierIPage);
        return Result.success(pageResult);
    }
}

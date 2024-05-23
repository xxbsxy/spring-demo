package com.cgdcgd.cc.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cgdcgd.cc.result.PageResult;
import com.cgdcgd.cc.result.Result;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cgdcgd.cc.mapper.SupplierMapper;
import com.cgdcgd.cc.entity.Supplier;
import com.cgdcgd.cc.service.SupplierService;
@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService{
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public Result<PageResult> getSupplier() {
        IPage<Supplier> page = new Page<>(1, 20);
        List<Supplier> list = supplierMapper.getSupplier(page);
        PageResult pageResult = new PageResult();
        pageResult.setRecords(list);
        pageResult.setTotal(page.getTotal());
        return Result.success(pageResult);
    }
}

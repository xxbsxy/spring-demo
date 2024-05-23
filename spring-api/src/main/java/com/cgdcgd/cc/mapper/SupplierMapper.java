package com.cgdcgd.cc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cgdcgd.cc.entity.Supplier;
import com.cgdcgd.cc.request.SearchSupplierReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {
    IPage<Supplier> getSupplier(IPage<Supplier> page, @Param("req") SearchSupplierReq req);
}

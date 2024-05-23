package com.cgdcgd.cc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cgdcgd.cc.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {
    List<Supplier> getSupplier(IPage<Supplier> page);
}

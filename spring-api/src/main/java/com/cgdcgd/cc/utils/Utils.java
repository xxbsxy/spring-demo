package com.cgdcgd.cc.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cgdcgd.cc.result.PageResult;

public class Utils {
   public static PageResult getDefaultPageResult(IPage page){
        PageResult pageResult = new PageResult();
        pageResult.setRecords(page.getRecords());
        pageResult.setTotalRows(page.getTotal());
        pageResult.setTotalPage(page.getPages());
        pageResult.setPageNo(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        return pageResult;
    }
}

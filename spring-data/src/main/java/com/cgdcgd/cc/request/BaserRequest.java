package com.cgdcgd.cc.request;

import com.cgdcgd.cc.constant.Constant;
import lombok.Data;



@Data
public class BaserRequest {
    Constant constant;
    private Integer pageNo = Constant.DEFAULT_PAGE_NO;
    private Integer pageSize = Constant.DEFAULT_PAGE_SIZE;
}

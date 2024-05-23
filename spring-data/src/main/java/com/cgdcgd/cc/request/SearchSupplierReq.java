package com.cgdcgd.cc.request;

import lombok.Data;

@Data
public class SearchSupplierReq extends BaserRequest {
    private String name;
    private String id;
    private Integer agencyType;
    private String shortName;
    private Integer state;
    private String code;
}

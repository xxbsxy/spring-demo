package com.cgdcgd.cc.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult implements Serializable {

    private long totalRows;

    private long totalPage;

    private long pageNo;

    private long pageSize;

    private List records;

}

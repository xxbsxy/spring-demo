package com.cgdcgd.cc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "Supplier")
public class Supplier {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 短码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 简称
     */
    @TableField(value = "short_name")
    private String shortName;

    /**
     * 类型（0为供应商，1为生产厂商，2为维修单位，3为销毁单位,5为品牌）
     */
    @TableField(value = "agency_type")
    private Integer agencyType;

    /**
     * 联系人
     */
    @TableField(value = "contacts")
    private String contacts;

    /**
     * 联系电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人员
     */
    @TableField(value = "create_user")
    private String createUser;

    /**
     * 最后更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 更新人ID
     */
    @TableField(value = "update_user")
    private String updateUser;

    /**
     * 1为启用，0为禁用
     */
    @TableField(value = "`state`")
    private Integer state;
}

package com.example.springdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "Student")
public class Student {
    @TableId(value = "s_id", type = IdType.INPUT)
    private String sId;

    @TableField(value = "s_name")
    private String sName;

    @TableField(value = "s_brith")
    private String sBrith;

    @TableField(value = "s_sex")
    private String sSex;

    /**
     * @return s_id
     */
    public String getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(String sId) {
        this.sId = sId;
    }

    /**
     * @return s_name
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return s_brith
     */
    public String getsBrith() {
        return sBrith;
    }

    /**
     * @param sBrith
     */
    public void setsBrith(String sBrith) {
        this.sBrith = sBrith;
    }

    /**
     * @return s_sex
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * @param sSex
     */
    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sBrith=").append(sBrith);
        sb.append(", sSex=").append(sSex);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
                && (this.getsName() == null ? other.getsName() == null : this.getsName().equals(other.getsName()))
                && (this.getsBrith() == null ? other.getsBrith() == null : this.getsBrith().equals(other.getsBrith()))
                && (this.getsSex() == null ? other.getsSex() == null : this.getsSex().equals(other.getsSex()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsName() == null) ? 0 : getsName().hashCode());
        result = prime * result + ((getsBrith() == null) ? 0 : getsBrith().hashCode());
        result = prime * result + ((getsSex() == null) ? 0 : getsSex().hashCode());
        return result;
    }
}

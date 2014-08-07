package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/6.
 */
@Entity
@Table(name = "sys_address", schema = "", catalog = "vdomain")
public class SysAddressModel {
    private String areaId;
    private String areaName;
    private int areaLevel;
    private String parentAreaId;
    private String areaCode;
    private String areaShort;
    private String aeraZip;
    private Integer orderSort;

    @Id
    @Column(name = "AREA_ID", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "AREA_NAME", nullable = false, insertable = true, updatable = true, length = 100)
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "AREA_LEVEL", nullable = false, insertable = true, updatable = true)
    public int getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(int areaLevel) {
        this.areaLevel = areaLevel;
    }

    @Basic
    @Column(name = "PARENT_AREA_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(String parentAreaId) {
        this.parentAreaId = parentAreaId;
    }

    @Basic
    @Column(name = "AREA_CODE", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "AREA_SHORT", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAreaShort() {
        return areaShort;
    }

    public void setAreaShort(String areaShort) {
        this.areaShort = areaShort;
    }

    @Basic
    @Column(name = "AERA_ZIP", nullable = true, insertable = true, updatable = true, length = 50)
    public String getAeraZip() {
        return aeraZip;
    }

    public void setAeraZip(String aeraZip) {
        this.aeraZip = aeraZip;
    }

    @Basic
    @Column(name = "ORDER_SORT", nullable = true, insertable = true, updatable = true)
    public Integer getOrderSort() {
        return orderSort;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysAddressModel that = (SysAddressModel) o;

        if (areaLevel != that.areaLevel) return false;
        if (aeraZip != null ? !aeraZip.equals(that.aeraZip) : that.aeraZip != null) return false;
        if (areaCode != null ? !areaCode.equals(that.areaCode) : that.areaCode != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (areaShort != null ? !areaShort.equals(that.areaShort) : that.areaShort != null) return false;
        if (orderSort != null ? !orderSort.equals(that.orderSort) : that.orderSort != null) return false;
        if (parentAreaId != null ? !parentAreaId.equals(that.parentAreaId) : that.parentAreaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = areaId != null ? areaId.hashCode() : 0;
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + areaLevel;
        result = 31 * result + (parentAreaId != null ? parentAreaId.hashCode() : 0);
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (areaShort != null ? areaShort.hashCode() : 0);
        result = 31 * result + (aeraZip != null ? aeraZip.hashCode() : 0);
        result = 31 * result + (orderSort != null ? orderSort.hashCode() : 0);
        return result;
    }
}

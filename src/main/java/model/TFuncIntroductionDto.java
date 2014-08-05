package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/5.
 */
@Entity
@Table(name = "t_func_introduction", schema = "", catalog = "vdomain")
public class TFuncIntroductionDto {
    private int id;
    private String funcName;
    private String funcTitle;
    private String funcIconUrl;
    private Integer funcParentId;
    private Integer funcOrderNo;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FUNC_NAME", nullable = true, insertable = true, updatable = true, length = 70)
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    @Basic
    @Column(name = "FUNC_TITLE", nullable = true, insertable = true, updatable = true, length = 70)
    public String getFuncTitle() {
        return funcTitle;
    }

    public void setFuncTitle(String funcTitle) {
        this.funcTitle = funcTitle;
    }

    @Basic
    @Column(name = "FUNC_ICON_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncIconUrl() {
        return funcIconUrl;
    }

    public void setFuncIconUrl(String funcIconUrl) {
        this.funcIconUrl = funcIconUrl;
    }

    @Basic
    @Column(name = "FUNC_PARENT_ID", nullable = true, insertable = true, updatable = true)
    public Integer getFuncParentId() {
        return funcParentId;
    }

    public void setFuncParentId(Integer funcParentId) {
        this.funcParentId = funcParentId;
    }

    @Basic
    @Column(name = "FUNC_ORDER_NO", nullable = true, insertable = true, updatable = true)
    public Integer getFuncOrderNo() {
        return funcOrderNo;
    }

    public void setFuncOrderNo(Integer funcOrderNo) {
        this.funcOrderNo = funcOrderNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFuncIntroductionDto that = (TFuncIntroductionDto) o;

        if (id != that.id) return false;
        if (funcIconUrl != null ? !funcIconUrl.equals(that.funcIconUrl) : that.funcIconUrl != null) return false;
        if (funcName != null ? !funcName.equals(that.funcName) : that.funcName != null) return false;
        if (funcOrderNo != null ? !funcOrderNo.equals(that.funcOrderNo) : that.funcOrderNo != null) return false;
        if (funcParentId != null ? !funcParentId.equals(that.funcParentId) : that.funcParentId != null) return false;
        if (funcTitle != null ? !funcTitle.equals(that.funcTitle) : that.funcTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (funcName != null ? funcName.hashCode() : 0);
        result = 31 * result + (funcTitle != null ? funcTitle.hashCode() : 0);
        result = 31 * result + (funcIconUrl != null ? funcIconUrl.hashCode() : 0);
        result = 31 * result + (funcParentId != null ? funcParentId.hashCode() : 0);
        result = 31 * result + (funcOrderNo != null ? funcOrderNo.hashCode() : 0);
        return result;
    }
}

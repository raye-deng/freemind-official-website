package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/18 0018.
 */
@Entity
@Table(name = "t_func", schema = "", catalog = "vdomain")
public class TFuncMode {
    private int id;
    private String funcName;
    private String funcTitle;
    private String funcPicurl;
    private String funcDesc;
    private Integer funcGuideEnable;
    private String funcGuideUrl;
    private String funcGuideId;
    private Integer funcTopicEnable;
    private String funcTopicUrl;
    private String funcTopicId;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FUNC_NAME", nullable = false, insertable = true, updatable = true, length = 70)
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    @Basic
    @Column(name = "FUNC_TITLE", nullable = false, insertable = true, updatable = true, length = 70)
    public String getFuncTitle() {
        return funcTitle;
    }

    public void setFuncTitle(String funcTitle) {
        this.funcTitle = funcTitle;
    }

    @Basic
    @Column(name = "FUNC_PICURL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncPicurl() {
        return funcPicurl;
    }

    public void setFuncPicurl(String funcPicurl) {
        this.funcPicurl = funcPicurl;
    }

    @Basic
    @Column(name = "FUNC_DESC", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getFuncDesc() {
        return funcDesc;
    }

    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_ENABLE", nullable = true, insertable = true, updatable = true)
    public Integer getFuncGuideEnable() {
        return funcGuideEnable;
    }

    public void setFuncGuideEnable(Integer funcGuideEnable) {
        this.funcGuideEnable = funcGuideEnable;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncGuideUrl() {
        return funcGuideUrl;
    }

    public void setFuncGuideUrl(String funcGuideUrl) {
        this.funcGuideUrl = funcGuideUrl;
    }

    @Basic
    @Column(name = "FUNC_GUIDE_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getFuncGuideId() {
        return funcGuideId;
    }

    public void setFuncGuideId(String funcGuideId) {
        this.funcGuideId = funcGuideId;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_ENABLE", nullable = true, insertable = true, updatable = true)
    public Integer getFuncTopicEnable() {
        return funcTopicEnable;
    }

    public void setFuncTopicEnable(Integer funcTopicEnable) {
        this.funcTopicEnable = funcTopicEnable;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_URL", nullable = true, insertable = true, updatable = true, length = 500)
    public String getFuncTopicUrl() {
        return funcTopicUrl;
    }

    public void setFuncTopicUrl(String funcTopicUrl) {
        this.funcTopicUrl = funcTopicUrl;
    }

    @Basic
    @Column(name = "FUNC_TOPIC_ID", nullable = true, insertable = true, updatable = true, length = 20)
    public String getFuncTopicId() {
        return funcTopicId;
    }

    public void setFuncTopicId(String funcTopicId) {
        this.funcTopicId = funcTopicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFuncMode tFuncMode = (TFuncMode) o;

        if (id != tFuncMode.id) return false;
        if (funcDesc != null ? !funcDesc.equals(tFuncMode.funcDesc) : tFuncMode.funcDesc != null) return false;
        if (funcGuideEnable != null ? !funcGuideEnable.equals(tFuncMode.funcGuideEnable) : tFuncMode.funcGuideEnable != null)
            return false;
        if (funcGuideId != null ? !funcGuideId.equals(tFuncMode.funcGuideId) : tFuncMode.funcGuideId != null)
            return false;
        if (funcGuideUrl != null ? !funcGuideUrl.equals(tFuncMode.funcGuideUrl) : tFuncMode.funcGuideUrl != null)
            return false;
        if (funcName != null ? !funcName.equals(tFuncMode.funcName) : tFuncMode.funcName != null) return false;
        if (funcPicurl != null ? !funcPicurl.equals(tFuncMode.funcPicurl) : tFuncMode.funcPicurl != null) return false;
        if (funcTitle != null ? !funcTitle.equals(tFuncMode.funcTitle) : tFuncMode.funcTitle != null) return false;
        if (funcTopicEnable != null ? !funcTopicEnable.equals(tFuncMode.funcTopicEnable) : tFuncMode.funcTopicEnable != null)
            return false;
        if (funcTopicId != null ? !funcTopicId.equals(tFuncMode.funcTopicId) : tFuncMode.funcTopicId != null)
            return false;
        if (funcTopicUrl != null ? !funcTopicUrl.equals(tFuncMode.funcTopicUrl) : tFuncMode.funcTopicUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (funcName != null ? funcName.hashCode() : 0);
        result = 31 * result + (funcTitle != null ? funcTitle.hashCode() : 0);
        result = 31 * result + (funcPicurl != null ? funcPicurl.hashCode() : 0);
        result = 31 * result + (funcDesc != null ? funcDesc.hashCode() : 0);
        result = 31 * result + (funcGuideEnable != null ? funcGuideEnable.hashCode() : 0);
        result = 31 * result + (funcGuideUrl != null ? funcGuideUrl.hashCode() : 0);
        result = 31 * result + (funcGuideId != null ? funcGuideId.hashCode() : 0);
        result = 31 * result + (funcTopicEnable != null ? funcTopicEnable.hashCode() : 0);
        result = 31 * result + (funcTopicUrl != null ? funcTopicUrl.hashCode() : 0);
        result = 31 * result + (funcTopicId != null ? funcTopicId.hashCode() : 0);
        return result;
    }
}

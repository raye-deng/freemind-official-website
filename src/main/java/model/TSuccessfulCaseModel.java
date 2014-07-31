package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/30.
 */
@Entity
@Table(name = "t_successful_case", schema = "", catalog = "vdomain")
public class TSuccessfulCaseModel {
    private int id;
    private String caseName;
    private String caseTitle;
    private String caseDesc;
    private String caseImgUrl;
    private String caseGuideUrl;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "caseName", nullable = true, insertable = true, updatable = true, length = 70)
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    @Basic
    @Column(name = "caseTitle", nullable = true, insertable = true, updatable = true, length = 70)
    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    @Basic
    @Column(name = "caseDesc", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getCaseDesc() {
        return caseDesc;
    }

    public void setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
    }

    @Basic
    @Column(name = "caseImgUrl", nullable = true, insertable = true, updatable = true, length = 500)
    public String getCaseImgUrl() {
        return caseImgUrl;
    }

    public void setCaseImgUrl(String caseImgUrl) {
        this.caseImgUrl = caseImgUrl;
    }

    @Basic
    @Column(name = "caseGuideUrl", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCaseGuideUrl() {
        return caseGuideUrl;
    }

    public void setCaseGuideUrl(String caseGuideUrl) {
        this.caseGuideUrl = caseGuideUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSuccessfulCaseModel that = (TSuccessfulCaseModel) o;

        if (id != that.id) return false;
        if (caseDesc != null ? !caseDesc.equals(that.caseDesc) : that.caseDesc != null) return false;
        if (caseGuideUrl != null ? !caseGuideUrl.equals(that.caseGuideUrl) : that.caseGuideUrl != null) return false;
        if (caseImgUrl != null ? !caseImgUrl.equals(that.caseImgUrl) : that.caseImgUrl != null) return false;
        if (caseName != null ? !caseName.equals(that.caseName) : that.caseName != null) return false;
        if (caseTitle != null ? !caseTitle.equals(that.caseTitle) : that.caseTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (caseName != null ? caseName.hashCode() : 0);
        result = 31 * result + (caseTitle != null ? caseTitle.hashCode() : 0);
        result = 31 * result + (caseDesc != null ? caseDesc.hashCode() : 0);
        result = 31 * result + (caseImgUrl != null ? caseImgUrl.hashCode() : 0);
        result = 31 * result + (caseGuideUrl != null ? caseGuideUrl.hashCode() : 0);
        return result;
    }
}

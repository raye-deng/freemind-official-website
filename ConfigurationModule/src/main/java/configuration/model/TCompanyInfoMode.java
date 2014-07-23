package configuration.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/23 0023.
 */
@Entity
@Table(name = "t_company_info", schema = "", catalog = "vdomain")
public class TCompanyInfoMode {
    private int id;
    private String infoTitle;
    private String infoDesc;
    private String infoImageUrl;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "INFO_TITLE", nullable = true, insertable = true, updatable = true, length = 100)
    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    @Basic
    @Column(name = "INFO_DESC", nullable = true, insertable = true, updatable = true, length = 2000)
    public String getInfoDesc() {
        return infoDesc;
    }

    public void setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc;
    }

    @Basic
    @Column(name = "INFO_IMAGE_URL", nullable = true, insertable = true, updatable = true, length = 200)
    public String getInfoImageUrl() {
        return infoImageUrl;
    }

    public void setInfoImageUrl(String infoImageUrl) {
        this.infoImageUrl = infoImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCompanyInfoMode that = (TCompanyInfoMode) o;

        if (id != that.id) return false;
        if (infoDesc != null ? !infoDesc.equals(that.infoDesc) : that.infoDesc != null) return false;
        if (infoImageUrl != null ? !infoImageUrl.equals(that.infoImageUrl) : that.infoImageUrl != null) return false;
        if (infoTitle != null ? !infoTitle.equals(that.infoTitle) : that.infoTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (infoTitle != null ? infoTitle.hashCode() : 0);
        result = 31 * result + (infoDesc != null ? infoDesc.hashCode() : 0);
        result = 31 * result + (infoImageUrl != null ? infoImageUrl.hashCode() : 0);
        return result;
    }
}

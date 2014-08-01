package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/31.
 */
@Entity
@Table(name = "t_merchants_func", schema = "", catalog = "vdomain")
public class TMerchantsFuncModel {
    private int id;
    private String merchantName;
    private String merchantPicUrl;
    private String merchantDesc;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "merchantName", nullable = true, insertable = true, updatable = true, length = 70)
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @Basic
    @Column(name = "merchantPicUrl", nullable = true, insertable = true, updatable = true, length = 500)
    public String getMerchantPicUrl() {
        return merchantPicUrl;
    }

    public void setMerchantPicUrl(String merchantPicUrl) {
        this.merchantPicUrl = merchantPicUrl;
    }

    @Basic
    @Column(name = "merchantDesc", nullable = true, insertable = true, updatable = true, length = 500)
    public String getMerchantDesc() {
        return merchantDesc;
    }

    public void setMerchantDesc(String merchantDesc) {
        this.merchantDesc = merchantDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TMerchantsFuncModel that = (TMerchantsFuncModel) o;

        if (id != that.id) return false;
        if (merchantDesc != null ? !merchantDesc.equals(that.merchantDesc) : that.merchantDesc != null) return false;
        if (merchantName != null ? !merchantName.equals(that.merchantName) : that.merchantName != null) return false;
        if (merchantPicUrl != null ? !merchantPicUrl.equals(that.merchantPicUrl) : that.merchantPicUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (merchantName != null ? merchantName.hashCode() : 0);
        result = 31 * result + (merchantPicUrl != null ? merchantPicUrl.hashCode() : 0);
        result = 31 * result + (merchantDesc != null ? merchantDesc.hashCode() : 0);
        return result;
    }
}

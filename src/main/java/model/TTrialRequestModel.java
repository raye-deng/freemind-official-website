package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2014/8/5.
 */
@Entity
@Table(name = "t_trial_request", schema = "", catalog = "vdomain")
public class TTrialRequestModel {
    private int id;
    private String userName;
    private String phoneNum;
    private String companyName;
    private String eMail;
    private String tCheck;
    private Timestamp tTime;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userName", nullable = true, insertable = true, updatable = true, length = 200)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "phoneNum", nullable = true, insertable = true, updatable = true, length = 100)
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "companyName", nullable = true, insertable = true, updatable = true, length = 500)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "eMail", nullable = true, insertable = true, updatable = true, length = 200)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "tCheck", nullable = true, insertable = true, updatable = true, length = 45)
    public String gettCheck() {
        return tCheck;
    }

    public void settCheck(String tCheck) {
        this.tCheck = tCheck;
    }

    @Basic
    @Column(name = "tTime", nullable = true, insertable = true, updatable = true)
    public Timestamp gettTime() {
        return tTime;
    }

    public void settTime(Timestamp tTime) {
        this.tTime = tTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTrialRequestModel that = (TTrialRequestModel) o;

        if (id != that.id) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (phoneNum != null ? !phoneNum.equals(that.phoneNum) : that.phoneNum != null) return false;
        if (tCheck != null ? !tCheck.equals(that.tCheck) : that.tCheck != null) return false;
        if (tTime != null ? !tTime.equals(that.tTime) : that.tTime != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (tCheck != null ? tCheck.hashCode() : 0);
        result = 31 * result + (tTime != null ? tTime.hashCode() : 0);
        return result;
    }
}

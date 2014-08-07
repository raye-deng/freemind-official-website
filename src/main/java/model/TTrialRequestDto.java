package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/6.
 */
@Entity
@Table(name = "t_trial_request", schema = "", catalog = "vdomain")
public class TTrialRequestDto {
    private int id;
    private String userName;
    private String phoneNum;
    private String companyName;
    private String eMail;
    private String tCheck;
    private String tNote;
    private String companyAddr;

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
    @Column(name = "tNote", nullable = true, insertable = true, updatable = true, length = 1000)
    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote;
    }

    @Basic
    @Column(name = "companyAddr", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTrialRequestDto that = (TTrialRequestDto) o;

        if (id != that.id) return false;
        if (companyAddr != null ? !companyAddr.equals(that.companyAddr) : that.companyAddr != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (phoneNum != null ? !phoneNum.equals(that.phoneNum) : that.phoneNum != null) return false;
        if (tCheck != null ? !tCheck.equals(that.tCheck) : that.tCheck != null) return false;
        if (tNote != null ? !tNote.equals(that.tNote) : that.tNote != null) return false;
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
        result = 31 * result + (tNote != null ? tNote.hashCode() : 0);
        result = 31 * result + (companyAddr != null ? companyAddr.hashCode() : 0);
        return result;
    }
}

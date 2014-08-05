package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2014/8/5.
 */
@Entity
@Table(name = "t_request_cooperation", schema = "", catalog = "vdomain")
public class TRequestCooperationModel {
    private int id;
    private String companyName;
    private String address;
    private String contacter;
    private String email;
    private String phone;
    private String tcheck;
    private Timestamp time;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyName", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 400)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "contacter", nullable = true, insertable = true, updatable = true, length = 70)
    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true, length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = true, insertable = true, updatable = true, length = 30)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "tcheck", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTcheck() {
        return tcheck;
    }

    public void setTcheck(String tcheck) {
        this.tcheck = tcheck;
    }

    @Basic
    @Column(name = "time", nullable = true, insertable = true, updatable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRequestCooperationModel that = (TRequestCooperationModel) o;

        if (id != that.id) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (contacter != null ? !contacter.equals(that.contacter) : that.contacter != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (tcheck != null ? !tcheck.equals(that.tcheck) : that.tcheck != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contacter != null ? contacter.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (tcheck != null ? tcheck.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}

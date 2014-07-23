package configuration.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/7/23 0023.
 */
@Entity
@Table(name = "t_user", schema = "", catalog = "vdomain")
public class TUserMode {
    private int id;
    private String act;
    private String pwd;
    private String userName;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "act", nullable = false, insertable = true, updatable = true, length = 40)
    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    @Basic
    @Column(name = "pwd", nullable = false, insertable = true, updatable = true, length = 100)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "user_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserMode tUserMode = (TUserMode) o;

        if (id != tUserMode.id) return false;
        if (act != null ? !act.equals(tUserMode.act) : tUserMode.act != null) return false;
        if (pwd != null ? !pwd.equals(tUserMode.pwd) : tUserMode.pwd != null) return false;
        if (userName != null ? !userName.equals(tUserMode.userName) : tUserMode.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (act != null ? act.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}

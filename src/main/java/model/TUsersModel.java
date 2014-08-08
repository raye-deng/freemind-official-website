package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/8.
 */
@Entity
@Table(name = "t_users", schema = "", catalog = "vdomain")
public class TUsersModel {
    private int id;
    private String passWord;
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
    @Column(name = "passWord", nullable = true, insertable = true, updatable = true, length = 500)
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "userName", nullable = true, insertable = true, updatable = true, length = 500)
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

        TUsersModel that = (TUsersModel) o;

        if (id != that.id) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}

package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/4.
 */
@Entity
@Table(name = "t_about_us", schema = "", catalog = "vdomain")
public class TAboutUsModel {
    private int id;
    private String title;
    private String imgUrl;
    private String aboutDesc;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "imgUrl", nullable = true, insertable = true, updatable = true, length = 500)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "aboutDesc", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getAboutDesc() {
        return aboutDesc;
    }

    public void setAboutDesc(String aboutDesc) {
        this.aboutDesc = aboutDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAboutUsModel that = (TAboutUsModel) o;

        if (id != that.id) return false;
        if (aboutDesc != null ? !aboutDesc.equals(that.aboutDesc) : that.aboutDesc != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (aboutDesc != null ? aboutDesc.hashCode() : 0);
        return result;
    }
}

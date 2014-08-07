package model;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/8/7.
 */
@Entity
@Table(name = "t_news", schema = "", catalog = "vdomain")
public class TNewsDto {
    private int id;
    private String newsContent;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "newsContent", nullable = true, insertable = true, updatable = true, length = 500)
    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TNewsDto tNewsDto = (TNewsDto) o;

        if (id != tNewsDto.id) return false;
        if (newsContent != null ? !newsContent.equals(tNewsDto.newsContent) : tNewsDto.newsContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (newsContent != null ? newsContent.hashCode() : 0);
        return result;
    }
}

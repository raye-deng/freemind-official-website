package configuration.dao;

import model.TAboutUsModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/8/1 0001.
 */
@Component("configTAboutUsDao")
public class CTAboutUsDao extends BaseDao {
    public List<TAboutUsModel> queryAboutUsList(){
        List<TAboutUsModel> aboutUsList  = (List<TAboutUsModel>)super.getAll(TAboutUsModel.class);
        return aboutUsList;
    }

    public TAboutUsModel queryOneAboutUs(String id){
        return (TAboutUsModel)super.getById(TAboutUsModel.class,Integer.parseInt(id.trim()));
    }

    public void saveAboutUs( TAboutUsModel aboutUs){
        System.out.println("AboutUs Dao");
        super.save(aboutUs);
        System.out.println("AboutUs Save in Dao Success;");
    }

    public void updateAboutUs(TAboutUsModel aboutUs){
        super.update(aboutUs);
    }

    public void delAboutUs(TAboutUsModel aboutUs){
        super.delete(aboutUs);
    }
}

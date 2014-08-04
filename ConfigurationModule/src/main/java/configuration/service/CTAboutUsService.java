package configuration.service;
import configuration.dao.CTAboutUsDao;
import model.TAboutUsModel;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * Created by Administrator on 2014/8/1 0001.
 */
@Service("congfigAboutUsService")
public class CTAboutUsService {
    @Resource(name = "configTAboutUsDao")
    CTAboutUsDao tAboutDao;

    public List<TAboutUsModel> queryAboutUsDaoList() {
        List<TAboutUsModel> aboutUsList = tAboutDao.queryAboutUsList();
        return aboutUsList;
    }

    public TAboutUsModel queryOneAboutUs(String id) {
        TAboutUsModel aboutUs = tAboutDao.queryOneAboutUs(id);
        return aboutUs;
    }

    public void saveAboutUs(TAboutUsModel aboutUs) {
        System.out.println("AboutUs Service");
        tAboutDao.saveAboutUs(aboutUs);
    }

    public void update(TAboutUsModel aboutUs) {
        tAboutDao.update(aboutUs);
    }

    public void delAboutUs(TAboutUsModel aboutUs){
        tAboutDao.delAboutUs(aboutUs);
    }
}

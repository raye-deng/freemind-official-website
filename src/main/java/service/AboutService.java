package service;/**
 * Created by 邓风森 on 2014/7/22.
 */
import  dao.TAboutUsDao;
import model.TAboutUsModel;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @ClassName: AboutService
 * @Description: 关于
 * @author:邓风森
 * @date: 2014/7/22 10:58
 */
@Service("aboutService")
public class AboutService {
    @Resource(name="tAboutUsDao")
    TAboutUsDao tAboutUsDao;
    public List<TAboutUsModel> getAboutList(){
        return tAboutUsDao.queryAboutList();
    }
}

package service;/**
 * Created by 邓风森 on 2014/7/22.
 */
import model.TMerchantsFuncModel;
import dao.TMerchantsFuncDao;
import model.TRequestCooperationModel;
import dao.TRequestCooperationDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @ClassName: MicroMarketingSerivce
 * @Description: 微营销
 * @author:邓风森
 * @date: 2014/7/22 10:59
 */
@Service("microMarketingSerivce")
public class MicroMarketingSerivce {
    @Resource(name="tMerchantsFuncDao")
    TMerchantsFuncDao tMerchantsFuncDao;
    @Resource(name="tRequestCooperationDao")
    TRequestCooperationDao tRequestCooperationDao;
    public List<TMerchantsFuncModel> getmerchantList(){
        return tMerchantsFuncDao.queryMerchantList();
    }

    public void saveRequest(TRequestCooperationModel Request){tRequestCooperationDao.save(Request);}
}

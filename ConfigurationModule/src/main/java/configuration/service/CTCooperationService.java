package configuration.service;

import model.TRequestCooperationModel;
import org.springframework.stereotype.Service;
import configuration.dao.CTCoorperationDao;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/8/4 0004.
 */
@Service("configTCooperationService")
public class CTCooperationService {
    @Resource(name="configTCooperationDao")
    CTCoorperationDao tCooperationDao;

    public List<TRequestCooperationModel> getCooperationList(){return tCooperationDao.queryCooperationList();}

    public TRequestCooperationModel getCooperation(String id){return tCooperationDao.queryOneCooperation(id);}

    public void updateCooperation(TRequestCooperationModel cooperation){tCooperationDao.updateCooperation(cooperation);}

    public void delCooperation(TRequestCooperationModel cooperatiion){tCooperationDao.delCooperation(cooperatiion);}
}

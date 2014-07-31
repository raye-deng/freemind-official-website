package dao;

import model.TRequestCooperationModel;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2014/7/31.
 */
@Component("tRequestCooperationDao")
public class TRequestCooperationDao extends BaseDao{
    public void saveRequest(TRequestCooperationModel Request)
    {
        super.save(Request);
    }
}

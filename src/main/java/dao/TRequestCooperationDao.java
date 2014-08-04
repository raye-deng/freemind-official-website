package dao;

import model.TRequestCooperationDto;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2014/7/31.
 */
@Component("tRequestCooperationDao")
public class TRequestCooperationDao extends BaseDao{
    public void saveRequest(TRequestCooperationDto Request)
    {
        super.save(Request);
    }
}

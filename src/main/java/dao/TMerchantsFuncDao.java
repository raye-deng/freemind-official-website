package dao;

import model.TMerchantsFuncModel;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Created by Administrator on 2014/7/31.
 */
@Component("tMerchantsFuncDao")
public class TMerchantsFuncDao extends BaseDao{
    public List<TMerchantsFuncModel> queryMerchantList()
    {
        List<TMerchantsFuncModel> merchantLsit = (List<TMerchantsFuncModel>)super.getAll(TMerchantsFuncModel.class);
        return merchantLsit;
    }
}

package configuration.dao;

import model.TTrialRequestModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/8/5 0005.
 */
@Component("configTTrialDao")
public class CTTrialDao extends BaseDao {
    public List<TTrialRequestModel> queryTrialList(){
         return (List<TTrialRequestModel>)super.getAll(TTrialRequestModel.class);
    }

    public TTrialRequestModel queryOneTrial(String id){
        return (TTrialRequestModel)super.getById(TTrialRequestModel.class,Integer.parseInt(id.trim()));
    }

    public void updateTrial(TTrialRequestModel trial){
        super.update(trial);
    }

    public void delTrial(TTrialRequestModel trial){
        super.delete(trial);
    }
}

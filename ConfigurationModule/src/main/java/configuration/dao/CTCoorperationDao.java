package configuration.dao;

import model.TRequestCooperationModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/8/4 0004.
 */
@Component("configTCooperationDao")
public class CTCoorperationDao extends BaseDao{
    public List<TRequestCooperationModel> queryCooperationList(){
        List<TRequestCooperationModel> cooperationList = (List<TRequestCooperationModel>)super.getAll(TRequestCooperationModel.class);
        return  cooperationList;
    }

    public TRequestCooperationModel queryOneCooperation(String id){
        return (TRequestCooperationModel)super.getById(TRequestCooperationModel.class,Integer.parseInt(id.trim()));
    }

    public void saveCooperation(TRequestCooperationModel cooperation){
        super.save(cooperation);
    }

    public void updateCooperation(TRequestCooperationModel cooperation){
        super.update(cooperation);
    }

    public void delCooperation(TRequestCooperationModel cooperation){
        super.delete(cooperation);
    }
}

package dao;

import org.springframework.stereotype.Component;
import model.TFuncintroductionModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Component("tFuncintroductionDao")
public class TFuncintroductionDao extends BaseDao {
     public List<TFuncintroductionModel> queryFuncList()
     {
         List<TFuncintroductionModel> FuncList = (List<TFuncintroductionModel>)super.getAll(TFuncintroductionDao.class);
         return FuncList;
     }

}

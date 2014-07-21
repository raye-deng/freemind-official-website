package dao;

import org.springframework.stereotype.Component;
import model.TFuncintroductionMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Component("tFuncintroductionDao")
public class TFuncintroductionDao extends BaseDao {
     public List<TFuncintroductionMode> queryFuncList()
     {
         List<TFuncintroductionMode> FuncList = (List<TFuncintroductionMode>)super.getAll(TFuncintroductionDao.class);
         return FuncList;
     }

}

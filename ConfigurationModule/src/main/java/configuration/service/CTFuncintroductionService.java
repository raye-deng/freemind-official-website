package configuration.service;
import configuration.dao.CTFuncintroductionDao;
import model.TFuncIntroductionModel;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Service("configTfuncIntroductionService")
public class CTFuncintroductionService {
    @Resource(name="configTFuncIntroductionDao")
    CTFuncintroductionDao tFuncintroductionDao;
    //Query List Of FunctionIntroduction
    public List<TFuncIntroductionModel> getTFuncList(){
        return tFuncintroductionDao.queryFuncList();
    }
    //Query One FunctionIntroduction Example
    public TFuncIntroductionModel getFunc(String funId){
        TFuncIntroductionModel func = tFuncintroductionDao.queryOneFunc(funId.trim());
        return func;
    }
    //Save Func
    public void saveFunc(TFuncIntroductionModel func)
    {
        tFuncintroductionDao.saveFunc(func);
    }
    //Update Func
    public void updateFunc(TFuncIntroductionModel func){
        tFuncintroductionDao.updateFunc(func);
    }
    //delete func
    public void delFunc(TFuncIntroductionModel func)
    {
        tFuncintroductionDao.delFunc(func);
    }
}

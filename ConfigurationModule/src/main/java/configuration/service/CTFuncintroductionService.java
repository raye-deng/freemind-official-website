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
    public List<TFuncIntroductionModel> getTFuncList(){
        return tFuncintroductionDao.queryFuncList();
    }
    public TFuncIntroductionModel getFunc(String funId){
        TFuncIntroductionModel func = tFuncintroductionDao.queryOneFunc(funId);
        return func;
    }
    public void saveFunc(TFuncIntroductionModel func)
    {
        tFuncintroductionDao.saveFunc(func);
    }
}

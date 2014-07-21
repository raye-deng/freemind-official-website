package service;

import dao.TFuncintroductionDao;
import model.TFuncintroductionModel;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Service("tFuncintroductionService")
public class TFuncintroductionService {
    @Resource(name="tFuncintroductionDao")
    TFuncintroductionDao tFuncintroductionDao;
    public List<TFuncintroductionModel> getFuncList()
    {
        return tFuncintroductionDao.queryFuncList();
    }


}

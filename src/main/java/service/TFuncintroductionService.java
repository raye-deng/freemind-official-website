package service;

import dao.TFuncintroductionDao;
import model.TFuncintroductionMode;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Service("tFuncintroductionService")
public class TFuncintroductionService {
    @Resource(name="tFuncintroductionDao");
    TFuncintroductionDao tFuncintroductionDao;
    public List<TFuncintroductionMode> getFuncList()
    {
        return tFuncintroductionDao.queryFuncList();
    }


}

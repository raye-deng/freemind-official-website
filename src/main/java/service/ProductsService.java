package service;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Service;
import dao.TFuncIntroductionDao;
import model.TFuncIntroductionModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ProductsService
 * @Description: 产品中心
 * @author:邓风森
 * @date: 2014/7/22 11:00
 */
@Service("productsService")
public class ProductsService {
    @Resource(name="tFuncIntroductionDao")
    TFuncIntroductionDao tFuncIntroductionDao;

    public List<TFuncIntroductionModel> getFuncIntroductionList(){
        return tFuncIntroductionDao.queryFuncList();
    }
}

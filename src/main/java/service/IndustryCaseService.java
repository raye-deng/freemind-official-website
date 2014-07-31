package service;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Service;
import dao.TSuccessfulCaseDao;
import model.TSuccessfulCaseModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: IndustryCaseService
 * @Description: 行业案例
 * @author:邓风森
 * @date: 2014/7/22 10:58
 */
@Service("industryCaseService")
public class IndustryCaseService {
    @Resource(name="tSuccessfulCaseDao")
    TSuccessfulCaseDao tSuccessfulCaseDao;

    public List<TSuccessfulCaseModel> getCaseList(){
        return tSuccessfulCaseDao.queryCaseList();
    }
}

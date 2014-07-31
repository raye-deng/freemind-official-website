package dao;

import model.TSuccessfulCaseModel;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * Created by Administrator on 2014/7/30.
 */
@Component("tSuccessfulCaseDao")
public class TSuccessfulCaseDao extends BaseDao{
    public List<TSuccessfulCaseModel> queryCaseList()
    {
        List<TSuccessfulCaseModel> caseList = (List<TSuccessfulCaseModel>)super.getAll(TSuccessfulCaseModel.class);
        return caseList;
    }
}

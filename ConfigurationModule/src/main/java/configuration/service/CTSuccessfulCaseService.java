package configuration.service;

import configuration.dao.CTSuccessfulCaseDao;
import model.TSuccessfulCaseModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/31 0031.
 */
@Service("configSuccessfulCaseService")
public class CTSuccessfulCaseService {
    @Resource(name="configSuccessfulCaseDao")
    CTSuccessfulCaseDao CTSuccessfulCaseDao;
    public List<TSuccessfulCaseModel> getTSuccessfulCassList(){
        List<TSuccessfulCaseModel> successfulCaseList = CTSuccessfulCaseDao.querySuccessfulCaseList();
        return successfulCaseList;
    }

    public TSuccessfulCaseModel getOneSuccessfulCase(String id){
        TSuccessfulCaseModel successfulCase = CTSuccessfulCaseDao.queryOneSuccessfulCase(id);
        return successfulCase;
    }

    public void saveSuccessfulCase(TSuccessfulCaseModel successfulCase){
        CTSuccessfulCaseDao.saveSuccessfulCase(successfulCase);
    }

    public void updateSuccessfulCase(TSuccessfulCaseModel successfulCase){
        CTSuccessfulCaseDao.updateSuccessfulCase(successfulCase);
    }

    public void delSuccessfulCase(TSuccessfulCaseModel succcessfulCase){
        CTSuccessfulCaseDao.delSuccessfulCase(succcessfulCase);
    }
}

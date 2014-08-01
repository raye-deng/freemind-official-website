package configuration.dao;

import model.TSliderImgModel;
import model.TSuccessfulCaseModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/7/31 0031.
 */
@Component("configSuccessfulCaseDao")
public class CTSuccessfulCaseDao extends BaseDao {
    public List<TSuccessfulCaseModel> querySuccessfulCaseList(){
        List<TSuccessfulCaseModel> successfulCaseList = (List<TSuccessfulCaseModel>)super.getAll(TSuccessfulCaseModel.class);
        System.out.println("query the list of SuccessfulCase.:size="+successfulCaseList.size());
        return successfulCaseList;
    }

    public TSuccessfulCaseModel queryOneSuccessfulCase(String id){
        TSuccessfulCaseModel successfulCase = (TSuccessfulCaseModel)super.getById(TSuccessfulCaseModel.class,Integer.parseInt(id));
        System.out.println("query one of SuccessfulCase.");
        return successfulCase;
    }

    public void saveSuccessfulCase(TSuccessfulCaseModel successfulCase){
        super.save(successfulCase);
        System.out.println("saveSuccessfulCase:CaseName="+successfulCase.getCaseName());
    }

    public void updateSuccessfulCase(TSuccessfulCaseModel successfulCase) {
        super.update(successfulCase);
        System.out.println("updateSuccessfulCase:id="+successfulCase.getId());
    }

    public void delSuccessfulCase(TSuccessfulCaseModel successfulCase){
        super.delete(successfulCase);
        System.out.println("delSuccessfulCase:id="+successfulCase.getId());
    }

}

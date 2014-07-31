package dao;

import model.TFuncIntroductionDto;
import org.springframework.stereotype.Component;
import model.TFuncIntroductionModel;

import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Component("tFuncIntroductionDao")
public class TFuncIntroductionDao extends BaseDao {
    public static final String HQL_QUERYFUNCDTOLIST="select f.id,f.funcName,f.funcTitle , f.funcIconUrl from TFuncIntroductionModel f";
    public List<TFuncIntroductionModel> queryFuncList()
    {
        List<TFuncIntroductionModel> funcList = (List<TFuncIntroductionModel>)super.getAll(TFuncIntroductionModel.class);
        System.out.println("123123");
        return funcList;
    }

    public List<TFuncIntroductionDto> queryFuncDtoList(){
        List<TFuncIntroductionDto> funcList=(List<TFuncIntroductionDto>)super.getAll(TFuncIntroductionDto.class);
        return funcList;

    }

}

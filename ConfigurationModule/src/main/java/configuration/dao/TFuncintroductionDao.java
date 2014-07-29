package configuration.dao;
import model.TFuncIntroductionDto;
import model.TFuncIntroductionModel;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Component("tFuncintroductionDao")
public class TFuncintroductionDao extends BaseDao {


    public List<TFuncIntroductionModel> queryFuncList(){
        List<TFuncIntroductionModel> FuncList = (List<TFuncIntroductionModel>)super.getAll(TFuncIntroductionModel.class);
        System.out.println("FuncList Size = "+ FuncList.size());
        return FuncList;
    }

    public TFuncIntroductionModel queryOneFunc(String funcId )
    {
      return (TFuncIntroductionModel)super.getById(TFuncIntroductionModel.class,funcId);
    }

    public List<TFuncIntroductionDto> queryFuncDtoList(){
        List<TFuncIntroductionDto> funcList=(List<TFuncIntroductionDto>)super.getAll(TFuncIntroductionDto.class);
        return funcList;
    }
    public void saveFunc(TFuncIntroductionModel func)
    {
        super.save(func);
        System.out.println("Save the Func");
    }



}

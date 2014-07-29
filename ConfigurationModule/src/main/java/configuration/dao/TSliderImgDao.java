package configuration.dao;


import model.TSliderImgModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Component("configSliderImgDao")
public class TSliderImgDao extends BaseDao {
    public List<TSliderImgModel> querySliderList(){
        List<TSliderImgModel> SliderList = (List<TSliderImgModel>)super.getAll(TSliderImgModel.class);
        System.out.println("Slider Size = "+ SliderList.size());
        return SliderList;
    }
    public void saveSlider(TSliderImgModel slider){
        super.save(slider);
    }
}

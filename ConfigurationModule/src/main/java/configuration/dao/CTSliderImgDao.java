package configuration.dao;



import model.TSliderImgModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Component("configSliderImgDao")
public class CTSliderImgDao extends BaseDao {
    public List<TSliderImgModel> querySliderList(){
        List<TSliderImgModel> SliderList = (List<TSliderImgModel>)super.getAll(TSliderImgModel.class);
        System.out.println("Slider Size = "+ SliderList.size());
        return SliderList;
    }

    public TSliderImgModel queryOneSlider(String id)
    {
        return (TSliderImgModel)super.getById(TSliderImgModel.class,Integer.parseInt(id));
    }

    public void saveSlider(TSliderImgModel slider){
        super.save(slider);
    }

    public void updateSlider(TSliderImgModel slider){super.update(slider);}

    public void delSlider(TSliderImgModel slider){super.delete(slider);}
}

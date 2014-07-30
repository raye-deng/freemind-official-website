package configuration.service;

import configuration.dao.CTSliderImgDao;
import model.TSliderImgModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Service("configSliderImgService")
public class CTSliderImgService {
    @Resource(name = "configSliderImgDao")
    CTSliderImgDao CTSliderImgDao;

    public List<TSliderImgModel> getSliderList() {
        List<TSliderImgModel> sliderList = CTSliderImgDao.querySliderList();
        return sliderList;
    }

    public TSliderImgModel getOneSlider(String id)
    {
        return CTSliderImgDao.queryOneSlider(id);
    }

    public void saveSlider(TSliderImgModel slider){
        CTSliderImgDao.saveSlider(slider);
    }

    public void updateSlider(TSliderImgModel slider){CTSliderImgDao.updateSlider(slider);}

    public void delSlider(TSliderImgModel slider){CTSliderImgDao.delSlider(slider);}
}

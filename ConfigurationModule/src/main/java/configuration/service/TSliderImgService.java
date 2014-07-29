package configuration.service;

import configuration.dao.TSliderImgDao;
import model.TSliderImgModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Service("configSliderImgService")
public class TSliderImgService {
    @Resource(name = "configSliderImgDao")
    TSliderImgDao tSliderImgDao;

    public List<TSliderImgModel> getSliderList() {
        List<TSliderImgModel> sliderList = tSliderImgDao.querySliderList();
        return sliderList;
    }

    public void saveSlider(TSliderImgModel slider){
        tSliderImgDao.saveSlider(slider);
    }
}

package dao;
/**
 * Created by Administrator on 2014/7/22.
 */

import model.TSliderImgModel;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("tSlideDao")
public class TSlideDao extends BaseDao{

    public List<TSliderImgModel> querySliderImage(String flag)
    {
        String hql = "from TSliderImgModel as slideImg where slideImg.sliderFlag='" + flag+"'";
        List<TSliderImgModel> SlideList = (List<TSliderImgModel>)super.pageQuery(hql);
        return SlideList;
    }
}

package service;/**
 * Created by 邓风森 on 2014/7/16.
 */

    import dao.TFuncIntroductionDao;
    import dao.TNavDao;
    import  dao.TSlideDao;
import model.*;
    import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: HomeService
 * @Description: test service
 * @author:邓风森
 * @date: 2014/7/16 15:45
 */

@Service("homeService")
public class HomeService {
    @Resource(name="testUserDao")
    TNavDao tNavDao;
    @Resource(name="tFuncIntroductionDao")
    TFuncIntroductionDao tFuncIntroductionDao;
    @Resource(name="tSlideDao")
    TSlideDao tSlideDao;


    public  List<TNavbarModel> getNavList(){
        return tNavDao.queryNavList();
    }


    public List<TFuncIntroductionDto> getTFuncDtoList(){
        return tFuncIntroductionDao.queryFuncDtoList();
    }

    public List<TSliderImgModel> getSliderImgList(String Flag){
        return tSlideDao.querySliderImage(Flag);
    }
}

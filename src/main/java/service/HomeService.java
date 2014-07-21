package service;/**
 * Created by 邓风森 on 2014/7/16.
 */

import dao.TNavDao;
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
    public TUserModel checkLogin(String account,String password){
       return tNavDao.queryUserByAccountAndPassword(account,password);
    }


    public  List<TNavbarModel> getNavList(){
        return tNavDao.queryNavList();
    }
}

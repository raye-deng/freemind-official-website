package service;/**
 * Created by 邓风森 on 2014/7/16.
 */

import dao.TestUserDao;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName: TestService
 * @Description: test service
 * @author:邓风森
 * @date: 2014/7/16 15:45
 */

@Service("testService")
public class TestService {
    @Resource(name="testUserDao")
    TestUserDao testUserDao;
    public TUserModel checkLogin(String account,String password){
       return testUserDao.queryUserByAccountAndPassword(account,password);
    }


    public  List<TNavbarModel> getNavList(){
        return testUserDao.queryNavList();
    }
}

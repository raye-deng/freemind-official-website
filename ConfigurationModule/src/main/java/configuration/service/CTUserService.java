package configuration.service;

import configuration.dao.UsersDao;
import model.TUsersModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2014/8/11 0011.
 */
@Service("configTUserService")
public class CTUserService {
    @Resource(name="configTUsersDao")
    UsersDao tUserDao;
    public TUsersModel queryOneUser(String id){
        return tUserDao.queryOneUser(id);
    }
    public void updateUser(TUsersModel user){
        tUserDao.updateUser(user);
    }
}

package configuration.dao;

import model.TUsersModel;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2014/8/11 0011.
 */
@Component("configTUsersDao")
public class UsersDao  extends BaseDao{
    public TUsersModel queryOneUser(String id){
        return (TUsersModel)super.getById(TUsersModel.class,Integer.parseInt(id));
    }
    public void updateUser(TUsersModel user){
        super.update(user);
    }
}

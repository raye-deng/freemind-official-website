package dao;/**
 * Created by 邓风森 on 2014/7/16.
 */

import model.TNavbarModel;
import model.TUserModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: TestUserDao
 * @Description: test user dao
 * @author:邓风森
 * @date: 2014/7/16 16:57
 */
@Component("testUserDao")
public class TestUserDao  extends  BaseDao {
    /**
     *
     * @param account
     * @param password
     * @return
     */
    public TUserModel queryUserByAccountAndPassword(String account, String password) {
        TUserModel tm1=new TUserModel();
        tm1.setAct(account);
        tm1.setPwd(password);
        TUserModel tm = null;

        tm = (TUserModel) super.getUnique("from TUserModel where act=? and pwd=?", tm1.getAct(),tm1.getPwd());

        if (tm == null) {
            return tm;
        } else {
            return tm;
        }
    }


    public  List<TNavbarModel> queryNavList(){
        List<TNavbarModel> navList=(List<TNavbarModel>)super.getAll(TNavbarModel.class);
        return navList;
    }
}

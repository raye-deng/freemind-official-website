package dao;/**
 * Created by 邓风森 on 2014/7/16.
 */

import model.TNavbarModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: TNavDao
 * @Description: test user dao
 * @author:邓风森
 * @date: 2014/7/16 16:57
 */
@Component("testUserDao")
public class TNavDao extends  BaseDao {



    public  List<TNavbarModel> queryNavList(){
        List<TNavbarModel> navList=(List<TNavbarModel>)super.getAll(TNavbarModel.class);
        return navList;
    }
}

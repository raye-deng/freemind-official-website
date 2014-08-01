package dao;

import model.TAboutUsModel;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * Created by Administrator on 2014/7/31.
 */
@Component("tAboutUsDao")
public class TAboutUsDao extends BaseDao{
    public List<TAboutUsModel> queryAboutList()
    {
        List<TAboutUsModel> aboutList = (List<TAboutUsModel>)super.getAll(TAboutUsModel.class);
        return aboutList;
    }
}

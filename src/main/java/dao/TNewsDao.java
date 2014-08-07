package dao;

import org.springframework.stereotype.Component;
import model.TNewsDto;
import java.util.List;
/**
 * Created by Administrator on 2014/8/7.
 */
@Component("tNewsDao")
public class TNewsDao extends BaseDao{
    public List<TNewsDto> queryNewsList(){
        return (List<TNewsDto>)super.getAll(TNewsDto.class);
    }
}

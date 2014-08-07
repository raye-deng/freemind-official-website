package dao;

import model.TTrialRequestDto;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * Created by Administrator on 2014/8/6.
 */
@Component("tTrialRequestDao")
public class TTrialRequestDao extends BaseDao {
    public void saveTrialRequest(TTrialRequestDto trialRequest)
    {
        super.save(trialRequest);
    }
}

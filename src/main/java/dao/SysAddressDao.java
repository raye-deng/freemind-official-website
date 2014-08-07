package dao;

import model.SysAddressModel;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * Created by Administrator on 2014/8/6.
 */
@Component("sysAddressDao")
public class SysAddressDao extends BaseDao{
    public List<SysAddressModel> queryProvince()
    {
        String hql="from SysAddressModel as province where province.areaLevel=1 order by orderSort";
        return (List<SysAddressModel>)super.pageQuery(hql);
    }

    public List<SysAddressModel> queryCity(String pid)
    {
        String hql="from SysAddressModel as city where city.areaLevel="+"2 and city.parentAreaId='"+pid+"' order by orderSort";
        return (List<SysAddressModel>)super.pageQuery(hql);
    }

    public List<SysAddressModel> queryArea(String pid)
    {
        String hql="from SysAddressModel as area where area.areaLevel="+"3 and area.parentAreaId='"+pid+"' order by orderSort";
        return (List<SysAddressModel>)super.pageQuery(hql);
    }

    public List<SysAddressModel> queryAllAddr()
    {
        return (List<SysAddressModel>)super.getAll(SysAddressModel.class);
    }
}

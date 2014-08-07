package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MicroMarketingSerivce;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import model.TMerchantsFuncModel;
import model.TRequestCooperationDto;

/**
 * @ClassName: MicroMarketingController
 * @Description: 微营销
 * @author:邓风森
 * @date: 2014/7/22 10:54
 */
@Controller
public class MicroMarketingController {
    @Resource(name="microMarketingSerivce")
    MicroMarketingSerivce microMarketingSerivce;

    @RequestMapping(value = "/microMarketing")
    public void index(HttpSession session,Model model){
        List<TMerchantsFuncModel> merchantList = microMarketingSerivce.getmerchantList();
        model.addAttribute("merchantList",merchantList);
        System.out.println("微营销界面");
    }

    @RequestMapping(value = "/applyRequest")
    public void applyRequest(HttpSession session,Model model,
                             String companyName,
                             String companyAddress,
                             String contacter,
                             String email,
                             String phone){
        try {
            TRequestCooperationDto newModel = new TRequestCooperationDto();
            newModel.setAddress(companyAddress);
            newModel.setCompanyName(companyName);
            newModel.setContacter(contacter);
            newModel.setEmail(email);
            newModel.setPhone(phone);
            microMarketingSerivce.saveRequest(newModel);
            model.addAttribute("msg", "提交成功，感谢您的支持，请耐心等候回复");
        }
        catch (Exception ex)
        {
            model.addAttribute("msg", "提交失败,请稍后重试");
        }
    }
}

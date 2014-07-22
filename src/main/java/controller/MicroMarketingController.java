package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MicroMarketingSerivce;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
        System.out.println("微营销界面");
    }
}

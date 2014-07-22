package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IndustryRelatedService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: IndustryRelatedController
 * @Description: 行业相关
 * @author:邓风森
 * @date: 2014/7/22 10:53
 */
@Controller
public class IndustryRelatedController {
    @Resource(name="industryRelatedService")
    IndustryRelatedService industryRelatedService;

    @RequestMapping(value = "/industryRelated")
    public void index(HttpSession session,Model model){
        System.out.println("行业相关界面");
    }
}

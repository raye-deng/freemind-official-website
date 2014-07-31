package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IndustryCaseService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import model.TSuccessfulCaseModel;
import java.util.List;

/**
 * @ClassName: IndustryCaseController
 * @Description: 行业案例
 * @author:邓风森
 * @date: 2014/7/22 10:53
 */
@Controller
public class IndustryCaseController {
    @Resource(name="industryCaseService")
    IndustryCaseService industryCaseService;

    @RequestMapping(value = "/industryCase")
    public void index(HttpSession session,Model model){
        List<TSuccessfulCaseModel> caseList = industryCaseService.getCaseList();
        model.addAttribute("caseList",caseList);
        System.out.println("行业案例界面");
    }
}

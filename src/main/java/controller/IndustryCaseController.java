package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IndustryCaseService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public void index(HttpSession session,Model model,HttpServletRequest request,HttpServletRequest response){
        List<TSuccessfulCaseModel> caseList = industryCaseService.getCaseList();
        String firstId;
        firstId = request.getParameter("firstId");
        if(firstId == null || firstId =="") {
            if (caseList.size() > 0)
                firstId = caseList.get(0).getId() + "";
            else
                firstId = "0";
        }
        model.addAttribute("firstId",firstId);
        model.addAttribute("caseList",caseList);
        System.out.println("行业案例界面");
    }
}

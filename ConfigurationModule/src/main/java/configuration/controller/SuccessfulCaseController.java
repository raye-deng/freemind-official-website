package configuration.controller;
import configuration.service.CTSuccessfulCaseService;
import model.TSuccessfulCaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2014/8/4 0004.
 */
@Controller
public class SuccessfulCaseController {
    @Resource(name="configSuccessfulCaseService")
    CTSuccessfulCaseService tsuccessfulCaseService;

    //----------------------------------successfulCase-----------------------------------------
    @RequestMapping(value="/successfulCase/successfulCaseMgr")
    public void successfulCaseMgr(HttpSession session,Model model){
        System.out.println("successfulCase page!");
        List<TSuccessfulCaseModel> tSuccessfulCaseList = null;
        try {
            tSuccessfulCaseList =  tsuccessfulCaseService.getTSuccessfulCassList();
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
        }
        model.addAttribute("tSuccessfulCaseList",tSuccessfulCaseList);
    }

    @RequestMapping(value="/successfulCase/newSuccessfulCase")
    public void newSuccessfulCase(){System.out.println("newSuccessfulCase page.");}

    @RequestMapping(value="/successfulCase/newSuccessfulCaseDo")
    public String newSuccessfulCaseDo(  String caseName,
                                        String caseTitle,
                                        String caseImgUrl,
                                        String caseDesc,
                                        String caseGuideUrl,HttpSession session,Model model    ){
        TSuccessfulCaseModel successfulCase = new TSuccessfulCaseModel();
        successfulCase.setCaseName(caseName);
        successfulCase.setCaseTitle(caseTitle);
        successfulCase.setCaseImgUrl(caseImgUrl);
        successfulCase.setCaseDesc(caseDesc);
        successfulCase.setCaseGuideUrl(caseGuideUrl);
        System.out.println("newSuccessfulCaseDo Page." + caseName);
        try{
            tsuccessfulCaseService.saveSuccessfulCase(successfulCase);
        }catch(Exception ex){
            ex.printStackTrace();
            return "/successfulCase/caseFailure";
        }
        return "/successfulCase/caseSuccess";
    }

    @RequestMapping(value="/successfulCase/updateSuccessfulCase")
    public void updateSuccessfulCase(String id,HttpSession session,Model model){
        TSuccessfulCaseModel successfulCase = null;
        try{
            successfulCase = tsuccessfulCaseService.getOneSuccessfulCase(id.trim());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Update SuccessfulCase Page.");
        model.addAttribute("tCase",successfulCase);
    }

    @RequestMapping(value="/successfulCase/updateSuccessfulCaseDo")
    public String updateSuccessfulCaseDo(  String id,
                                           String caseName,
                                           String caseTitle,
                                           String caseImgUrl,
                                           String caseDesc,
                                           String caseGuideUrl,
                                           HttpSession session,
                                           Model model  ){
        TSuccessfulCaseModel successfulCase = new TSuccessfulCaseModel();
        successfulCase.setId(Integer.parseInt(id));
        successfulCase.setCaseName(caseName);
        successfulCase.setCaseTitle(caseTitle);
        successfulCase.setCaseImgUrl(caseImgUrl);
        successfulCase.setCaseDesc(caseDesc);
        successfulCase.setCaseGuideUrl(caseGuideUrl);
        System.out.println("newSuccessfulCaseDo Page.ID:" + id);
        try{
            tsuccessfulCaseService.updateSuccessfulCase(successfulCase);
        }catch(Exception ex){
            ex.printStackTrace();
            return "/successfulCase/caseFailure";
        }
        return "/successfulCase/caseSuccess";
    }

    @RequestMapping(value="/successfulCase/delSuccessfulCase")
    public String delSuccessfulCase(String id){
        TSuccessfulCaseModel successfulCase = null;
        try {
            successfulCase =tsuccessfulCaseService.getOneSuccessfulCase(id.trim());
            tsuccessfulCaseService.delSuccessfulCase(successfulCase);
        }catch(Exception ex){
            ex.printStackTrace();
            return "/successfulCase/caseFailure";
        }
        return "/successfulCase/caseSuccess";
    }

    @RequestMapping(value="/successfulCase/caseSuccess")
    public void caseSucccessPage(){}

    @RequestMapping(value="/successfulCase/caseFailure")
    public void caseFailurePage(){}
}

package configuration.controller;
import configuration.service.CTFuncintroductionService;
import configuration.service.CTSliderImgService;
import model.TFuncIntroductionModel;
import model.TSliderImgModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Controller
public class ConfigController {
    @Resource(name = "configTfuncIntroductionService")
    CTFuncintroductionService tfuncintroductionService;
    @Resource(name ="configSliderImgService")
    CTSliderImgService tsliderImgService;

    @RequestMapping(value = "/index")
    public void home(HttpSession session,Model model){
        System.out.println("home page!");
    }

    //---------------------------------------function--------------------------------------------
    @RequestMapping(value = "/function/funcMgr")
    public void funcMgr(HttpSession session,Model model){
        System.out.println("funcMgr page!");
        List<TFuncIntroductionModel> tFuncList = null;
        try {
            tFuncList = tfuncintroductionService.getTFuncList();
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
        }
        model.addAttribute("tFuncList",tFuncList);
    }

    @RequestMapping(value = "/function/newFunc")
    public void newFuncPage(HttpSession session,Model model){
        System.out.println("newFuncPage page!");
    }

    @RequestMapping(value = "/function/newFuncDo")
    public String newFuncDo(String funcName,
                            String funcTitle,
                            String funcDesc,
                            String funcPicUrl,
                            HttpSession session,Model model ){
        System.out.println("newFuncDo"+funcName);
        TFuncIntroductionModel func = new TFuncIntroductionModel();
        func.setFuncName(funcName);
        func.setFuncTitle(funcTitle);
        func.setFuncDesc(funcDesc);
        func.setFuncPicUrl(funcPicUrl);
        try {
            tfuncintroductionService.saveFunc(func);
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
            return "/function/funcFailure";
        }
        return "/function/funcSuccess";
    }

    @RequestMapping(value = "/function/updateFunc")
    public void updateFuncpage(HttpSession session,Model model){
        System.out.println("updateFunc page!");
    }

    //---------------------------------------slider--------------------------------------------
    @RequestMapping(value = "/slider/sliderMgr")
    public void sliderMgr(HttpSession session,Model model){
        System.out.println("sliderMgr page!");
        List<TSliderImgModel> tSliderList = null;
        try {
            tSliderList = tsliderImgService.getSliderList();
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
        }
        model.addAttribute("tSliderList",tSliderList);
    }

    @RequestMapping(value = "/slider/newSlider")
    public void newSliderPage(HttpSession session,Model model){
        System.out.println("newSliderPage page!");
    }

    @RequestMapping(value = "/slider/newSliderDo")
    public String newSliderPageDo(String sliderType,
                                String targetUrl,
                                String imgUrl,
                                String imgDesc,
                                HttpSession session,Model model){
        System.out.println("/slider/newSliderPageDo !");
        TSliderImgModel slider = new TSliderImgModel();
        slider.setSliderFlag(sliderType);
        slider.setTargetUrl(targetUrl);
        slider.setImgUrl(imgUrl);
        slider.setImgDesc(imgDesc);
        try {
            tsliderImgService.saveSlider(slider);
        }catch(Exception ex)
        {
            model.addAttribute("ERROR",ex);
            return "/slider/sliderSuccess";//操作失败页面
        }
        return "/slider/sliderFailure";//操作成功
    }

    @RequestMapping(value = "/slider/updateSlider")
    public void updateSlider(HttpSession session,Model model){
        System.out.println("updateSlider page!");
    }

}

package configuration.controller;
import configuration.service.CTFuncintroductionService;
import configuration.service.CTSliderImgService;
import model.TFuncIntroductionModel;
import model.TSliderImgModel;
import org.springframework.http.HttpRequest;
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
            ex.printStackTrace();
        }
        model.addAttribute("tFuncList",tFuncList);
    }

    @RequestMapping(value = "/function/newFunc")
    public void newFuncPage(HttpSession session,Model model){
        System.out.println("newFuncPage page!");
    }

    @RequestMapping(value = "/function/newFuncDo")
    public String newFuncDo(
                            String funcName,
                            String funcTitle,
                            String funcParentId,
                            String funcDesc,
                            String funcPicUrl,
                            String funcIconUrl,
                            HttpSession session,Model model ){
        System.out.println("newFuncDo"+funcName);
        TFuncIntroductionModel func = new TFuncIntroductionModel();
        func.setFuncName(funcName);
        func.setFuncParentId(Integer.parseInt(funcParentId));
        func.setFuncTitle(funcTitle);
        func.setFuncDesc(funcDesc);
        func.setFuncPicUrl(funcPicUrl);
        func.setFuncIconUrl(funcIconUrl);
        try {
            tfuncintroductionService.saveFunc(func);
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
            ex.printStackTrace();
            return "/function/funcFailure";
        }
        return "/function/funcSuccess";
    }

    @RequestMapping(value = "/function/updateFunc")
    public void updateFuncpage(String func_Id,HttpSession session,Model model){
        TFuncIntroductionModel func = tfuncintroductionService.getFunc(func_Id);
        model.addAttribute("tFunc",func);
    }

    @RequestMapping(value = "/function/updateFuncDo")
    public String updateFuncDo(
                                 String id,
                                 String funcName,
                                 String funcTitle,
                                 String funcParentId,
                                 String funcDesc,
                                 String funcPicUrl,
                                 String funcIconUrl,
                                 HttpSession session,Model model)
    {
        TFuncIntroductionModel func = new TFuncIntroductionModel();
        func.setId(Integer.parseInt(id));
        func.setFuncName(funcName);
        func.setFuncTitle(funcTitle);
        func.setFuncParentId(Integer.parseInt(funcParentId));
        func.setFuncDesc(funcDesc);
        func.setFuncPicUrl(funcPicUrl);
        func.setFuncIconUrl(funcIconUrl);
        try {
            System.out.println("updateFuncDoController:");
            tfuncintroductionService.updateFunc(func);
        }catch (Exception ex)
        {
            model.addAttribute("ERROR",ex);
            ex.printStackTrace();
            return "/function/funcFailure";
        }
        return "/function/funcSuccess";
    }
    @RequestMapping(value = "/function/funcSuccess")
    public void funcSuccess(HttpSession session,Model model){}

    @RequestMapping(value = "/function/funcFailure")
    public void funcFailure(HttpSession session,Model model){}

    @RequestMapping(value ="/function/delFunc")
    public String delFunc(String id,HttpSession session,Model model)
    {
        try {
            TFuncIntroductionModel func = tfuncintroductionService.getFunc(id);
            tfuncintroductionService.delFunc(func);
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return "/function/funcFailure";
        }
        return "/function/funcSuccess";

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
        System.out.println("/slider/newSliderPageDo !"+sliderType);
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
            ex.printStackTrace();
            return "/slider/sliderFailure";//操作失败页面
        }
        return "/slider/sliderSuccess";//操作成功
    }

    @RequestMapping(value = "/slider/updateSlider")
    public void updateSlider(String sliderId,HttpSession session,Model model){
        System.out.println("updateSlider page:SliderID="+sliderId);
        TSliderImgModel tSlider = tsliderImgService.getOneSlider(sliderId);
        model.addAttribute("tSlider",tSlider);
    }

    @RequestMapping(value = "/slider/updateSliderDo")
    public String updateSliderDo(  String id,
                                   String sliderType,
                                   String targetUrl,
                                   String imgUrl,
                                   String imgDesc,
                                   HttpSession session,Model model){
        System.out.println("/slider/newSliderPageDo !"+sliderType);
        TSliderImgModel slider = new TSliderImgModel();
        slider.setId(Integer.parseInt(id));
        slider.setSliderFlag(sliderType);
        slider.setTargetUrl(targetUrl);
        slider.setImgUrl(imgUrl);
        slider.setImgDesc(imgDesc);
        try {
            tsliderImgService.updateSlider(slider);
        }catch(Exception ex)
        {
            model.addAttribute("ERROR",ex);
            ex.printStackTrace();
            return "/slider/sliderFailure";//操作失败页面
        }
        return "/slider/sliderSuccess";//操作成功
    }
    @RequestMapping(value = "/slider/sliderSuccess")
    public void sliderSuccess(HttpSession session,Model model){}

    @RequestMapping(value = "/slider/sliderFailure")
    public void sliderFailure(HttpSession session,Model model){}

    @RequestMapping(value ="/slider/delSlider")
    public String  delSlider(String id,HttpSession session,Model model){
        try {
            TSliderImgModel slider = tsliderImgService.getOneSlider(id);
            tsliderImgService.delSlider(slider);
        }catch (Exception ex)
        {
            ex.printStackTrace();
            return "/slider/sliderFailure";//操作失败页面
        }
        return "/slider/sliderSuccess";//操作成功

    }

}

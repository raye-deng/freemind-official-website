package configuration.controller;

import configuration.service.CTAboutUsService;
import model.TAboutUsModel;
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
public class AboutUsController {
    @Resource(name="congfigAboutUsService")
    CTAboutUsService tAboutUsService;
    //----------------------------------aboutUs-----------------------------------------
    @RequestMapping(value="/aboutUs/aboutUsMgr")
    public void aboutUsMgr( HttpSession session,Model model){
        List<TAboutUsModel> aboutUsList = null;
        try{
            aboutUsList = tAboutUsService.queryAboutUsDaoList();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        model.addAttribute("tAboutUsList",aboutUsList);
    }

    @RequestMapping(value="/aboutUs/newAboutUs")
    public void newAboutUs( HttpSession session,Model model){
        System.out.println("Save AboutUs page");
    }

    @RequestMapping(value="/aboutUs/newAboutUsDo")
    public void newAboutUsDo(   String title,
                                String imgUrl,
                                String desc,
                                HttpSession session,
                                Model model
    ){
        TAboutUsModel aboutus = new TAboutUsModel();
        aboutus.setTitle(title);
        aboutus.setImgUrl(imgUrl);
        aboutus.setDesc(desc);
        System.out.println("newAboutUsDo Controller"+title);
        try{
            tAboutUsService.saveAboutUs(aboutus);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

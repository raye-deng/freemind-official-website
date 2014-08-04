package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import model.TAboutUsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AboutService;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: AboutController
 * @Description: 关于
 * @author:邓风森
 * @date: 2014/7/22 10:52
 */
@Controller
public class AboutController {
    @Resource(name="aboutService")
    AboutService aboutService;

    @RequestMapping(value = "/about")
    public void index(HttpSession session,Model model){
        String firstId;
        List<TAboutUsModel> aboutList = aboutService.getAboutList();
        if(aboutList.size() > 0) {
            firstId = aboutList.get(0).getId() + "";
        }
        else
            firstId = "0";
        model.addAttribute("firstId",firstId);
        model.addAttribute("aboutList",aboutList);
        System.out.println("关于界面");
    }
}

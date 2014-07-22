package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AboutService;

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
        System.out.println("关于界面");
    }
}

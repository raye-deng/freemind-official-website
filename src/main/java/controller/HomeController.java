package controller;
/**
 * Created by 邓风森 on 2014/7/16.
 */

import model.TFuncintroductionModel;
import model.TNavbarModel;
import model.TUserModel;
import model.dto.TFuncDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.HomeService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: testController
 * @Description: test controller
 * @author:邓风森
 * @date: 2014/7/16 15:43
 */
@Controller
public class HomeController {
    @Resource(name = "homeService")
    HomeService homeService;

    @RequestMapping(value = "/home")
    public void home(HttpSession session,Model model){
        System.out.println("home page!");
        List<TFuncintroductionModel> tFuncDtoList=homeService.getTFuncDtoList();
        model.addAttribute("tFuncDtoList",tFuncDtoList);
    }

    @RequestMapping(value = "/common/fixedHeader")
    public void fixedHeader(HttpSession session,Model model){
        System.out.println("header included");
        List<TNavbarModel> navList=homeService.getNavList();
        model.addAttribute("navList",navList);
    }

    @RequestMapping(value = "/common/footer")
    public void footer(HttpSession session,Model model){
        System.out.println("footer included");
    }

}

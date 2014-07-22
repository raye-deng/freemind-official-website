package configuration.controller;/**
 * Created by  葛佳欣 on 2014/7/22.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: TestController
 * @Description:
 * @author:
 * @date: 2014/7/22 9:13
 */
@Controller
public class VdomainBackStageController {
    @RequestMapping(value = "/index")
    public void home(HttpSession session,Model model){
        System.out.println("home page!");

    }
    @RequestMapping(value = "/funcMgr")
    public void funcMgr(HttpSession session,Model model){
        System.out.println("funcMgr page!");

    }
    @RequestMapping(value = "/newFunc")
    public void newFunc(HttpSession session,Model model){
        System.out.println("newFunc page!");

    }
    @RequestMapping(value = "/updateFunc")
    public void updateFunc(HttpSession session,Model model){
        System.out.println("updateFunc page!");
    }
}

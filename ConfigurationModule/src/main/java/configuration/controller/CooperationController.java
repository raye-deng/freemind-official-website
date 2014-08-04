package configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/8/4 0004.
 */
@Controller
public class CooperationController {
    @RequestMapping(value = "/cooperation/cooperationMgr")
    public void cooperationMgr(HttpSession session,Model model){
        System.out.println("cooperationMgr Page");
    }
}

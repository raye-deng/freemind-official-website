package configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/8/11 0011.
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login/login")
    public void loginpage(HttpSession session,Model model){

    }
    @RequestMapping(value="/login/loading")
    public String loading(HttpSession session,Model model){
        return "/index";
    }
}

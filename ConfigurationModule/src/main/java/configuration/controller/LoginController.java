package configuration.controller;

import configuration.service.CTUserService;
import model.TUsersModel;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/8/11 0011.
 */
@Controller
public class LoginController {

    @Resource(name="configTUserService")
    CTUserService userService;

    @RequestMapping(value="/login/login")
    public void loginpage(HttpSession session,Model model){}


    @RequestMapping(value="/login/loading")
    public String loading(String id ,
                          String passWord,
                          HttpSession session,Model model){
        TUsersModel user =null;
        try{
            System.out.println("Id:"+id+";Password:"+passWord+";");
            user = userService.queryOneUser(id);
            if(user!=null){
                if(user.getPassWord().equals(passWord)){
                    session.setAttribute("id",user.getId());
                    session.setAttribute("password",user.getPassWord());
                    return "/index";
                }
            }
            else{
                return "/login/errorlogin";
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "/login/errorlogin";
    }
}

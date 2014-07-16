package controller;
/**
 * Created by 邓风森 on 2014/7/16.
 */

import com.sun.deploy.net.HttpResponse;
import model.TUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.TestService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: testController
 * @Description: test controller
 * @author:邓风森
 * @date: 2014/7/16 15:43
 */
@Controller
public class TestController {
   @Resource(name = "testService")
    TestService testService;
    @RequestMapping(value = "/login")
    public String login(HttpSession session,Model model,String account,String password){

        System.out.print("login:"+account+":"+password);
        TUserModel tm=testService.checkLogin(account,password);
        if(tm!=null){
            session.setAttribute("loginUser",tm);
            System.out.println("login user id="+tm.getId()+":name="+tm.getUserName());
            return "home";
        }else{
            return "failed";
        }
    }
}

package configuration.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
/**
 * Created by Administrator on 2014/7/24 0024.
 */
@Controller
public class ConfigController {
    //HomePage
    @RequestMapping(value = "/index")
    public void home(HttpSession session,Model model){
        System.out.println("home page!");
    }

}

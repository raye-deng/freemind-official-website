package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.SmartWiFiService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

/**
 * @ClassName: SmartWiFiController
 * @Description: 智能WIFI控制器
 * @author:邓风森
 * @date: 2014/7/22 9:49
 */
@Controller
public class SmartWiFiController {
    @Resource(name="smartWiFiService")
    SmartWiFiService smartWiFiService;


    @RequestMapping("/smartWiFi")
    public void index(HttpSession session,Model model){
        System.out.println("智能wifi界面");
    }
}

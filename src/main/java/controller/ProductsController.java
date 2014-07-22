package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: ProductsController
 * @Description: 产品中心
 * @author:邓风森
 * @date: 2014/7/22 10:54
 */
@Controller
public class ProductsController {
    @Resource(name="productsService")
    ProductsService productsService;


    @RequestMapping(value = "/products")
    public void index(HttpSession session,Model model){
        System.out.println("产品中心界面");
    }
}

package controller;/**
 * Created by 邓风森 on 2014/7/22.
 */

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ProductsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.TFuncIntroductionModel;
import java.util.List;

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
    public void index(HttpSession session,Model model,HttpServletRequest request,HttpServletRequest response){
        System.out.println("产品中心界面");
        String funcId = request.getParameter("funcId");
        List<TFuncIntroductionModel> tFuncList = this.productsService.getFuncIntroductionList();
        model.addAttribute("tFuncList",tFuncList);
        model.addAttribute("funcId",funcId);

    }
}

package controller;

import model.TFuncintroductionMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TFuncintroductionService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/7/21 0021.
 */
@Controller
public class TFuncintroductionController {
    @Resource(name = "tFuncintroductionService");
    TFuncintroductionService tFuncintroductionService;

    @RequestMapping(value = "/FuncIntroductionWeb")
    public void showFuncList(Model model)
    {
        List<TFuncintroductionMode> FuncList = tFuncintroductionService.getFuncList();
        model.addAttribute("FuncLsit",FuncList);
    }
}

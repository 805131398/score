package com.yuezhix.score.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {


    @RequestMapping("/getThymeleaf")
    public String welcome(ModelMap map){
        map.addAttribute("host","baidu.com");
        return "luojay";
    }
}

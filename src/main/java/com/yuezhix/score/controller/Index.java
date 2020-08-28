package com.yuezhix.score.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Index {

    @RequestMapping("/index")
    public ModelAndView index(@RequestParam(value = "name", defaultValue = "Uzi") String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",name);
        return new ModelAndView("index");
    }
}

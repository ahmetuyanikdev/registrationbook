package com.source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap modelMap){
        modelMap.addAttribute("message","Welcome Registration App");
        modelMap.addAttribute("messageFooter","This is sample footer");
        return "home";
    }
}

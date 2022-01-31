package com.source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class HomePageController {

    public HomePageController(){
        System.out.println(">>----- message");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        return "index";
    }
}

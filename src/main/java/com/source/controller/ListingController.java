package com.source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/listing")
public class ListingController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap modelMap){
        modelMap.addAttribute("message","Listing page");
        return "listing";
    }
}

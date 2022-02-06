package com.source.controller;


import com.source.model.Person;
import com.source.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/listing")
public class ListingController {

    private PersonService personService;


    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap modelMap){
        modelMap.addAttribute("message","Listing page");
        List<Person> personList = personService.getAllPeople();
        modelMap.addAttribute("personList",personList);
        return "listing";
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}

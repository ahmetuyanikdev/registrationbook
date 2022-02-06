package com.source.controller;

import com.source.form.RegistrationForm;
import com.source.model.Person;
import com.source.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap modelMap){
        modelMap.addAttribute("message","Registration page");
        modelMap.addAttribute("messageFooter","This is sample footer");
        modelMap.addAttribute("person",new RegistrationForm());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute("person") RegistrationForm registrationForm,ModelMap modelMap){
        final Person person = new Person();
        person.setFirstName(registrationForm.getFirstName());
        person.setLastName(registrationForm.getLastName());
        person.setAddress(registrationForm.getLastName());
        person.setBloodGroup(registrationForm.getBloodGroup());
        person.setPhone(registrationForm.getPhone());
        personService.save(person);
        return "registration";
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}

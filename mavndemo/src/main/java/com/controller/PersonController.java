package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Person;

@Controller
public class PersonController {
	public PersonController(){
		System.out.println("CREATING PERSONCONTROLLER");
	}
@RequestMapping("/addPerson")
public ModelAndView getPersonDetails(@ModelAttribute("person") Person person)
{
	return new ModelAndView("displayPerson","personObj", person);
	
	}
@RequestMapping("/getPersonForm")
public String getPersonForm(Model model){
	model.addAttribute("person",new Person());
return "persondetails";
}
}

package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloController {
	@RequestMapping("/sayHello")
	public ModelAndView sayHello(){
		return new ModelAndView("welcome","message","welcome to spring MVC framework");
		
	}
	@RequestMapping("/sayGoodBye")
	public ModelAndView goodBye(){
		return new ModelAndView("welcome","message","Thank you ! GoodBye");
	}

}

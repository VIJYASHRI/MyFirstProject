package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;



@Controller 
public class ProductController {
	public ProductController(){
		System.out.println("CREATED PRODUCT CONTROLLER");
	}
@RequestMapping("/productForm")
public String getProductForm (Model model){
	model.addAttribute("product", new Product());
	return "productform";
}

@RequestMapping("/procesProductData")
public ModelAndView displayProductDetails(@ModelAttribute("product") Product product)
{
	return new ModelAndView("displayProduct","productObj", product);
	
}

}

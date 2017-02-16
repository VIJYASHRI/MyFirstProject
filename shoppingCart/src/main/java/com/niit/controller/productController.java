package com.niit.controller;			

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.model.Product;
import com.niit.service.CategoryService;
import com.niit.service.ProductService;

@Controller
public class productController {
@Autowired
private ProductService productService;

@Autowired
private CategoryService categoryService;

@RequestMapping(value="/products", method=RequestMethod.GET)
	public String getProductForm (Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("categories",categoryService.getCategory());
		return "products";
}

	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String saveProduct (
			@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors())
			return "products";
		productService.saveProduct(product);
		return "redirect:/products";
	}
	
@RequestMapping("/all/product/getAllProducts")
public String getAllProduct(Model model){
	List<Product> products=productService.getProductById(); //Assigning list of products to model attribute products
		model.addAttribute("productList",products);
		return "productlist";
	}

	@RequestMapping("/all/product/viewproduct/{id}")
	public String viewProduct(@PathVariable int id,Model model){
		List<Product> product=productService.getProductById();
		model.addAttribute("product",product);
	return "viewProduct";
	}

	@RequestMapping("/admin/product/deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id){
		productService.deleteProduct(id);
		return "redirect:/all/product/getAllProducts";
	}


	/**
	 *    to display the form to edit product details
	 */
	@RequestMapping("/admin/product/editform/{id}")
	public String editProductForm(@PathVariable int id,Model model){
		List<Product> product=productService.getProductById(); //getProductById(id) gives error
		model.addAttribute("product",product);
		model.addAttribute("categories",categoryService.getCategory());
		return "editproductform";
	}
	@RequestMapping("/admin/product/editProduct")
	public String editProductDetails(@Valid @ModelAttribute("product") Product product,
			BindingResult result){
		if(result.hasErrors())
			return "productform";
		productService.updateProduct(product);
		return "redirect:/all/product/getAllProducts";
	}
	@RequestMapping("/all/product/productsByCategory")
	public String getProductsByCategory(@RequestParam (name="searchCondition") String searchCondition,
			Model model){
		List<Product> products=productService.getProductById();
		//Assigning list of products to model attribute products
		model.addAttribute("productList",products);
		model.addAttribute("searchCondition",searchCondition);
		return "productlist";
	}
	
}
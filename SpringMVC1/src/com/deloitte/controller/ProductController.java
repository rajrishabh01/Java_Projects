package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.pojo.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/Product", method = RequestMethod.GET)
	public ModelAndView Product() {
		Product p1 = new Product();
		p1.setId(4);
		return new ModelAndView("Product", "command",p1);
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("SpringMVC1") Product product, ModelMap model) {
		model.addAttribute("name", product.getName());
		model.addAttribute("price", product.getPrice());
		model.addAttribute("id", product.getId());
		
		return "result";

	}
	
	
}

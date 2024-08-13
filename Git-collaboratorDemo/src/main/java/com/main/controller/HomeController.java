package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.ProductI.ProductServiceI;
import com.main.model.Product;

@RestController
public class HomeController {

	@Autowired
	ProductServiceI pi;
	
	@PostMapping("/add")
	public Product insert(@RequestBody Product p) {
		
		Product p1 = pi.savedata(p);
		return p1;
	}
	
}

package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/get")
	public List<Product> retrive() {
		List<Product> l = pi.getdata();
		return l;
	}
	
	@PostMapping("/update/{pid}")
	public Product modify(@PathVariable("pid") int id, @RequestBody Product p) {
		Product p3 = pi.savedata(p);
		return p3;
	}
	
	@DeleteMapping("/del/{pid}")
	public String deletedata(@PathVariable("pid") int id) {
		pi.deldata(id);
		return "delete";
	}
	
	@PatchMapping("/single/{pid}")
	public String singledata(@PathVariable("pid") int id, @RequestBody Product p) {
		
		String pro = p.getPname();
		pi.updata(id,pro);
		return "updated";
	}
}


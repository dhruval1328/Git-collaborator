package com.main.ProductImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ProductI.ProductServiceI;
import com.main.ProductRepo.ProductRepository;
import com.main.model.Product;
@Service
public class ProductServiceImpl implements ProductServiceI{

	@Autowired
	ProductRepository pr;
	
	@Override
	public Product savedata(Product p) {
		
		return pr.save(p);
	}

//	@Override
//	public void getdata() {
//		pr.findAll();
//		
//	}

}

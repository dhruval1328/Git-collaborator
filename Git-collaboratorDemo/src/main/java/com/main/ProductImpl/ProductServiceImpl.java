package com.main.ProductImpl;

import java.util.List;

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

	@Override
	public List<Product> getdata() {
		return pr.findAll();
	}

	@Override
	public void deldata(int id) {
		pr.deleteById(id);
		
	}

	@Override
	public void updata(int id, String pro) {
		pr.updateDataByName(id, pro);
	}



}

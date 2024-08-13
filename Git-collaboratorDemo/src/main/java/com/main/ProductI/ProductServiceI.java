package com.main.ProductI;

import java.util.List;

import com.main.model.Product;

public interface ProductServiceI {

	Product savedata(Product p);

	List<Product> getdata();

	void deldata(int id);

	void updata(int id, String pro);



}

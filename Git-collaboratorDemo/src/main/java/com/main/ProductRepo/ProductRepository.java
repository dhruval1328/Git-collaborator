package com.main.ProductRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.main.model.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Transactional
	@Modifying
	@Query("update Product set pname=:pname where pid=:pid")
	public void updateDataByName(int pid, String pname);
}

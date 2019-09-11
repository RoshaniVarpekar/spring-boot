package com.demoone.dao;

import java.util.List;

import com.psl.demoone.Product;



public interface ProductDAO {

	public List<Product> findAll();
	public int save(Product product);
	public int delete(String code);
	public int update(Product p);
}

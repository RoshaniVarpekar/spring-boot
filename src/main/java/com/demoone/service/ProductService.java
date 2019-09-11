package com.demoone.service;

import java.util.List;

import com.psl.demoone.Product;

public interface ProductService {

	public List<Product> findAll();

	public int deleteProduct(String code);

	public int updateProduct(Product p);

	public int createProduct(Product p);
}

package com.demoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demoone.dao.ProductDAO;
import com.psl.demoone.Product;

@Repository("productService")
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	@Override
	public int deleteProduct(String code) {
		return productDAO.delete(code);
	}

	@Override
	public int updateProduct(Product p) {
		return productDAO.update(p);
	}

	@Override
	public int createProduct(Product p) {
		return productDAO.save(p);
	}
}

package com.demoone.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.psl.demoone.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> findAll() {
		String query = "select * from products";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));
	}

	@Override
	public int save(Product p) {
		String query = "insert into products values(?,?,?)";
		Object param[] = { p.getCode(), p.getName(), p.getPrice() };
		return jdbcTemplate.update(query, param);
	}

	@Override
	public int delete(String code) {
		String query = "delete from products where code=?";
		Object param[] = { code };
		return jdbcTemplate.update(query, param);
	}

	@Override
	public int update(Product p) {
		String query = "update products set name=?,price=? where code=?";
		Object param[] = { p.getName(),p.getPrice(),p.getCode() };
		return jdbcTemplate.update(query, param);
	}

}

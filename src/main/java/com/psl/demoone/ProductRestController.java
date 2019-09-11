package com.psl.demoone;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoone.service.ProductService;
import com.demoone.service.ProductServiceImpl;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService productService;

	public ProductRestController() {

	}

//	@RequestMapping(path="/products",method=RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.findAll();
	}

	@PostMapping("/products")
	public void create(@RequestBody Product p) {
		 productService.createProduct(p);
	}

	@DeleteMapping("/products/{code}")
	public void delete(@PathVariable("code") String code) {
		productService.deleteProduct(code);
	}

	@PutMapping("products/{code}")
	public void update(@PathVariable("code") String code, @RequestBody Product p) {
		productService.updateProduct(p);
	}

}

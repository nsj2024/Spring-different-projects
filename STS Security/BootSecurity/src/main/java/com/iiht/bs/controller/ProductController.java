package com.iiht.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.iiht.bs.model.Product;
import com.iiht.bs.service.ProductServiceImpl;

@RestController

@RequestMapping("/product-service")

public class ProductController {

	@Autowired
	ProductServiceImpl product;

	@Autowired
	Environment enviroment;

	@GetMapping("/default")
	public String welcome() {
		String port = enviroment.getProperty("server.port");
		return "Programming microservice @ " + port;
	}

	@GetMapping("/products")
    @PreAuthorize("hasRole('ADMIN')")
	public List<Product> findAll() {

		return product.findAll();

	}

	@GetMapping("/products-by-category/{category}")

	public List<Product> findByCategory(@PathVariable("category") String category) {

		return product.findByCategory(category);

	}

	@GetMapping("/products-by-id/{id}")

	public Product findById(@PathVariable("id") int id) {

		return product.findById(id);

	}

}

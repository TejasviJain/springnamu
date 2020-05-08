package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.Product;
import com.zensar.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product AddProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
	}
	
	@PostMapping("/savelist")
	public List<Product> AddListProduct(@RequestBody List<Product> product)
	{
		return productService.saveListProduct(product);
	}
	
	@GetMapping("/display")
	public List<Product> DisplayProducts()
	{
		return productService.getProducts();
	}
	
	@PutMapping("/update")
	public Product UpdateProduct(@RequestBody Product product)
	{
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeletProduct(@PathVariable int id)
	{
		return productService.deleteproduct(id);
	}
	
	@GetMapping("/product/{id}")
	public Product ProductById(@PathVariable int id)
	{
		return productService.getproductbyid(id);
	}
	
	  @GetMapping("/products/{name}") public Product ProductByName(@PathVariable
	  String ProductName) { return productService.getproductbyname(ProductName); }
	 
}

package com.zensar.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.model.Product;
import com.zensar.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	public List<Product> saveListProduct(List<Product> product) {
		// TODO Auto-generated method stub
		return productRepository.saveAll(product);
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product existingproduct = productRepository.findById(product.getProductId()).orElse(product);
		existingproduct.setProductName(product.getProductName());
		existingproduct.setProductCost(product.getProductCost());
		return productRepository.save(existingproduct);
	}

	public String deleteproduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		return "product remove ||"+id;
	}

	public Product getproductbyid(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

	
	  public Product getproductbyname(String ProductName) { 
	  return productRepository.findByName(ProductName); }
	 
	
	
}

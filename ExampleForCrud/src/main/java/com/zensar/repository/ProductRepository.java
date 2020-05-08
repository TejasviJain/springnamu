package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	 Product findByName(String ProductName); 

}

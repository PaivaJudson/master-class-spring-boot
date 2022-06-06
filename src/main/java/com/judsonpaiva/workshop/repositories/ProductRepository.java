package com.judsonpaiva.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.judsonpaiva.workshop.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

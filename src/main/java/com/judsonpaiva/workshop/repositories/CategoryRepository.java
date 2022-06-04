package com.judsonpaiva.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.judsonpaiva.workshop.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

package com.judsonpaiva.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.judsonpaiva.workshop.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

package com.judsonpaiva.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.judsonpaiva.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

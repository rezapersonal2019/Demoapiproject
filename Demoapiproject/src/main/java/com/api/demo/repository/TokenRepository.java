package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.model.ExternalTokens;

public interface TokenRepository extends JpaRepository<ExternalTokens, Integer>{
	
	
}




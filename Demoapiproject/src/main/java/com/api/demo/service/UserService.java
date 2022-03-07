package com.api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.api.demo.model.ExternalTokens;
import com.api.demo.repository.TokenRepository;

import java.io.IOException;
import java.util.List;

@Service
@Transactional

public class UserService {

	@Autowired
	private TokenRepository userRepository;

	public List<ExternalTokens> listjiratokenapi() {
		return userRepository.findAll();
	}

	public void saveUser(ExternalTokens jiratokenapi) {
		userRepository.save(jiratokenapi);
	}
    
	
	
	
	
}

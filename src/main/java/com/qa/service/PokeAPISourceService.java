package com.qa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PokeAPISourceService {
	
	ResponseEntity<Object> findByNumber(String number);
	ResponseEntity<Object> findByName(String name);

}

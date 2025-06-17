package com.sptraders.sptraders_entry.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sptraders.sptraders_entry.dto.RequestDTO;

@RestController
public class EntryController {
	
	
	//Adding customer
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody RequestDTO requestDTO)
	{
		return null;
	}

}

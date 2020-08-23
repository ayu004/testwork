package com.test.gcp.cloudbuild.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

	
	@GetMapping("/total")
	public void getTotal() {
		System.out.println("Hit at the API received");
	}
}

package com.codedecode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.service.Services;

@RestController
public class Controller {
@Autowired
private Services se;

@GetMapping("sendEmail")
public String email() {
	se.sendEmail("A2023Mca10070@Imsec.ac.in", "text", "pass");
	
	return"sent sucessfully";
}
}

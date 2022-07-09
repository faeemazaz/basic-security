package com.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "auth/rest")
public class AuthController {
	
	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "We are inside authentication controller !!";
	}
}

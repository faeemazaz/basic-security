package com.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "noauth/rest")
public class NoAuthController {
	@RequestMapping(value = "/hello")
	public String helloWorld() {
		return "We are inside no authentication controller !!";
	}
}

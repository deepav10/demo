package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deepa")
public class MyController {

	@RequestMapping(method = RequestMethod.GET, value = "/ping", produces = MediaType.TEXT_HTML_VALUE)
	public String ping() {
		return "true";
	}
}

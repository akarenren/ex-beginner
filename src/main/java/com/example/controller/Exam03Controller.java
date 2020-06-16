package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String input() {
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Product product) {
		return "exam03-result";
	}
}
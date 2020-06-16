package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {

	@RequestMapping("/")
	public String form() {
		return "exam01";
	}
}

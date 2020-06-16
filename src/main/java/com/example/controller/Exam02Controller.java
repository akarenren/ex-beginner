package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String form() {
		return "exam02";
	}
	
	@RequestMapping("/result1")
	public String firstResult(int num1, int num2) {
		int total = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("total", total);
		
		return "exam02-result";
	}
	
	@RequestMapping("/result2")
	public String secondResult() {
		return "exam02-result2";
	}
}

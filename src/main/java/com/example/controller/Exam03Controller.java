package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ProductList;

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
	public String result(ProductList productList) {
		int total = productList.getPrice1() + productList.getPrice2() + productList.getPrice3();
		int totalWithTax = (int)(total * 1.1);
		application.setAttribute("total", total);
		application.setAttribute("totalWithTax", totalWithTax);
		return "exam03-result";
	}
}

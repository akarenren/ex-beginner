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
		application.setAttribute("price1", productList.getPrice1());
		application.setAttribute("price2", productList.getPrice2());
		application.setAttribute("price3", productList.getPrice3());
		return "exam03-result";
	}
}

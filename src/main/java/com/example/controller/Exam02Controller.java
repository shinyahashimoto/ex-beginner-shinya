package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/result")
	public String result(Integer num1, Integer num2) {
		int sum = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("sum", sum);
		return "exam02-result";
		
	}
	
	
	@RequestMapping("/to-page2")
	public String toPage2() {
		return "exam02-result2";
	}

}

package com.financas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard")
public class Dashboard {
	
	@RequestMapping
	public ModelAndView novo() {
		return new ModelAndView("Dashboard");
	}
}

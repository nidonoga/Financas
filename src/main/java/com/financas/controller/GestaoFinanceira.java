package com.financas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/gestao")
public class GestaoFinanceira {
	
	
	@RequestMapping
	public ModelAndView novo() {
		return new ModelAndView("GestaoFinanceira");
	}

}

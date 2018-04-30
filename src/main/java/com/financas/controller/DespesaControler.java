package com.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.financas.repository.DespesaRepository;

@Controller
@RequestMapping("/despesa")
public class DespesaControler {
	
	
	@Autowired
	private DespesaRepository despesa;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroDespesa";
	}

}

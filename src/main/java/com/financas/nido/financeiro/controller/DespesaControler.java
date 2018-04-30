package com.financas.nido.financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.financas.nido.financeiro.repository.Despesa;

@Controller
@RequestMapping("/despesa")
public class DespesaControler {
	
	
	@Autowired
	private Despesa despesa;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroDespesa";
	}

}

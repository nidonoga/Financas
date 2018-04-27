package com.financas.nido.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DespesaControler {
	
	
	@RequestMapping("despesa/novo")
	public String novo() {
		return "CadastroDespesa";
	}

}

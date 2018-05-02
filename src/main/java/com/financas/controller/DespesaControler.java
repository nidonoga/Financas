package com.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.financas.model.Despesa;
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
	
	@RequestMapping(method = RequestMethod.POST)
	public String criar(Despesa novaDespesa) {
		despesa.save(novaDespesa);
		return "CadastroDespesa";
	}

}

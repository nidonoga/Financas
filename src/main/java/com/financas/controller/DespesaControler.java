package com.financas.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.financas.model.Despesa;
import com.financas.model.RecorrenciaPagamento;
import com.financas.repository.DespesaRepository;

@Controller
@RequestMapping("/despesa")
public class DespesaControler {
	
	@Autowired
	private DespesaRepository despesa;
	
	
	@RequestMapping
	public ModelAndView novo() {
		return new ModelAndView("Teste");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView criar(Despesa novaDespesa) {
		despesa.save(novaDespesa);
		
		ModelAndView mv = new ModelAndView("CadastroDespesa");
		mv.addObject("mensagem", "Salvo com sucesso!");
		return mv;
	}
	
	@ModelAttribute("todasRecorrenciasPagamento")
	public List<RecorrenciaPagamento> todasRecorrenciasPagamento() {
		return Arrays.asList(RecorrenciaPagamento.values());
	}
}

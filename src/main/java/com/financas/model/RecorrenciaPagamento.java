package com.financas.model;

public enum RecorrenciaPagamento {

		UNICO("Pagamento Único"),
		DIARIA("Diária"),
		SEMANAL("Semanal"),
		MENSAL("Mensal"),
		ANUAL("Anual");
		
	private String descricao;
	
	RecorrenciaPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}

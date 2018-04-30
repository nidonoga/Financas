package com.financas.model;

public enum RecorrenciaPagamento {

		DIARIA("Di\\00E1 ria"),
		SEMANAL("Semanal"),
		MENSAL("Mensal"),
		ANUAL("Anual");
		
	private String recorrencia;
	
	
	RecorrenciaPagamento(String recorrencia) {
		this.recorrencia = recorrencia;
	}
	
	public String getRecorrencia() {
		return recorrencia;
	}
}

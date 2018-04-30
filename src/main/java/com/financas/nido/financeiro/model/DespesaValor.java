package com.financas.nido.financeiro.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DespesaValor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoDespesaValor;
	
	private BigDecimal valorDespesa;
	
	private BigDecimal valorPago;
	
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Long getCodigoDespesaValor() {
		return codigoDespesaValor;
	}

	public BigDecimal getValorDespesa() {
		return valorDespesa;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setCodigoDespesaValor(Long codigoDespesaValor) {
		this.codigoDespesaValor = codigoDespesaValor;
	}

	public void setValorDespesa(BigDecimal valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoDespesaValor == null) ? 0 : codigoDespesaValor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DespesaValor other = (DespesaValor) obj;
		if (codigoDespesaValor == null) {
			if (other.codigoDespesaValor != null)
				return false;
		} else if (!codigoDespesaValor.equals(other.codigoDespesaValor))
			return false;
		return true;
	}

}

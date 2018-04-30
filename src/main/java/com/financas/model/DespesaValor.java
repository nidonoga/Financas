package com.financas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "despesaValor")
public class DespesaValor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoDespesaValor;
	
	private BigDecimal valorDespesa;
	
	private BigDecimal valorPago;
	
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	
	@ManyToOne
	@JoinColumn(name = "codigo_despesa")
	private Despesa despesa;

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

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
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

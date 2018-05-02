package com.financas.model;

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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name = "pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoPagamento;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valorPago;
	
	private String comprovante;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	@ManyToOne
	@JoinColumn(name = "codigo_despesa")
	private Despesa despesa;

	public Long getCodigoPagamento() {
		return codigoPagamento;
	}

	public void setCodigoPagamento(Long codigoPagamento) {
		this.codigoPagamento = codigoPagamento;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public String getComprovante() {
		return comprovante;
	}

	public void setComprovante(String comprovante) {
		this.comprovante = comprovante;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
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
		result = prime * result + ((codigoPagamento == null) ? 0 : codigoPagamento.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (codigoPagamento == null) {
			if (other.codigoPagamento != null)
				return false;
		} else if (!codigoPagamento.equals(other.codigoPagamento))
			return false;
		return true;
	}
}

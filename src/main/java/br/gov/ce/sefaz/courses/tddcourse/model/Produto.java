package br.gov.ce.sefaz.courses.tddcourse.model;

import java.math.BigDecimal;

public class Produto {

	public BigDecimal valor;

	public Produto(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}

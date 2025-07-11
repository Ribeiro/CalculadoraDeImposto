package br.gov.ce.sefaz.courses.tddcourse.model;

import java.math.BigDecimal;

public class Produto {

	private final BigDecimal valor;

	public Produto(BigDecimal valor) {
		if (valor == null) {
			throw new IllegalArgumentException("O valor do produto não pode ser nulo");
		}
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("O valor do produto não pode ser zero ou negativo");
		}
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}

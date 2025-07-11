package br.gov.ce.sefaz.courses.tddcourse.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

	public BigDecimal valor;

	public Produto(BigDecimal valor) {
		Objects.requireNonNull(valor, "O valor do produto não pode ser nulo");
		if (valor.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("O valor do produto não pode ser negativo");
		}
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}

package br.gov.ce.sefaz.courses.tddcourse.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum CalculadoraDeImposto {

	ICMS {
		@Override
		public BigDecimal calcularSobre(Produto produto) {
			return produto.getValor()
					       .multiply(DEZESSETE_PORCENTO)
					       .setScale(DUAS_CASAS_DECIMAIS, RoundingMode.CEILING);
		}
	}, IPI {
		@Override
		public BigDecimal calcularSobre(Produto produto) {
			return produto.getValor()
					       .multiply(VINTE_PORCENTO)
					       .setScale(DUAS_CASAS_DECIMAIS, RoundingMode.CEILING);
		}
	}, NOVO_IMPOSTO {
		@Override
		public BigDecimal calcularSobre(Produto produto) {
			return produto.getValor()
					       .multiply(DOZE_PORCENTO)
					       .setScale(DUAS_CASAS_DECIMAIS, RoundingMode.CEILING);
		}
	};
	
	private static final int DUAS_CASAS_DECIMAIS = 2;
	private static final BigDecimal DOZE_PORCENTO = new BigDecimal("0.12");
	private static final BigDecimal VINTE_PORCENTO = new BigDecimal("0.2");
	private static final BigDecimal DEZESSETE_PORCENTO = new BigDecimal("0.17");

	public abstract BigDecimal calcularSobre(Produto produto);

}

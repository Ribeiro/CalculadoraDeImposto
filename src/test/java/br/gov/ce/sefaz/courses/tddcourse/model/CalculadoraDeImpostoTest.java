package br.gov.ce.sefaz.courses.tddcourse.model;

import br.gov.ce.sefaz.courses.tddcourse.fixture.ProdutoFixture;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class CalculadoraDeImpostoTest {

	private static Produto produtoDeDuzentosReais;

	@BeforeAll
	static void setup() {
		produtoDeDuzentosReais = ProdutoFixture.deDuzentosReais();
	}

	@Test
	void DeveCalcularDezessetePorcentoDeIcmsSobreValorDoProduto() {
		assertThat(
			CalculadoraDeImposto.ICMS.calcularSobre(produtoDeDuzentosReais),
			equalTo(ProdutoFixture.valorEsperadoICMS())
		);
	}

	@Test
	void DeveCalcularVintePorcentoDeIpiSobreValorDoProduto() {
		assertThat(
			CalculadoraDeImposto.IPI.calcularSobre(produtoDeDuzentosReais),
			equalTo(ProdutoFixture.valorEsperadoIPI())
		);
	}

	@Test
	void DeveCalcularDozePorcentoDeNovoImpostoSobreValorDoProduto() {
		assertThat(
			CalculadoraDeImposto.NOVO_IMPOSTO.calcularSobre(produtoDeDuzentosReais),
			equalTo(ProdutoFixture.valorEsperadoNovoImposto())
		);
	}
}

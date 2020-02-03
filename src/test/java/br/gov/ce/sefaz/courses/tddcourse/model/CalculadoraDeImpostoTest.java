package br.gov.ce.sefaz.courses.tddcourse.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.math.BigDecimal;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculadoraDeImpostoTest {
	private static BigDecimal trintaEQuatroReais;
	private static BigDecimal quarentaReais;
	private static BigDecimal vinteEQuatroReais;
	private static Produto produtoDeDuzentosReais;
	
	@BeforeClass
	public static void Setup(){
		produtoDeDuzentosReais = new Produto(new BigDecimal("200.00"));
		trintaEQuatroReais = new BigDecimal("34.00");
		quarentaReais = new BigDecimal("40.00");
		vinteEQuatroReais = new BigDecimal("24.00");
	}
	
	@Test
	public void DeveCalcularDezessetePorcentoDeIcmsSobreValorDoProduto()
	{
		assertThat(CalculadoraDeImposto.ICMS.calcularSobre(produtoDeDuzentosReais), equalTo(trintaEQuatroReais));
	}
	
	@Test
	public void DeveCalcularVintePorcentoDeIpiSobreValorDoProduto()
	{
		assertThat(CalculadoraDeImposto.IPI.calcularSobre(produtoDeDuzentosReais), equalTo(quarentaReais));
	}
	
	@Test
	public void DeveCalcularDozePorcentoDeNovoImpostoSobreValorDoProduto()
	{
		assertThat(CalculadoraDeImposto.NOVO_IMPOSTO.calcularSobre(produtoDeDuzentosReais), equalTo(vinteEQuatroReais));
	}

}
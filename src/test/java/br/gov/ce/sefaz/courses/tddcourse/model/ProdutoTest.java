package br.gov.ce.sefaz.courses.tddcourse.model;

import org.junit.Test;
import java.math.BigDecimal;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProdutoTest {

    @Test
    public void DeveCriarProdutoComValorPositivo() {
        BigDecimal valor = new BigDecimal("150.00");
        Produto produto = new Produto(valor);
        assertThat(produto.getValor(), equalTo(valor));
    }

    @Test
    public void DeveCriarProdutoComValorZero() {
        BigDecimal valor = BigDecimal.ZERO;
        Produto produto = new Produto(valor);
        assertThat(produto.getValor(), equalTo(valor));
    }

    @Test(expected = IllegalArgumentException.class)
    public void DeveLancarExcecaoQuandoValorForNegativo() {
        new Produto(new BigDecimal("-10.00"));
    }

    @Test(expected = NullPointerException.class)
    public void DeveLancarExcecaoQuandoValorForNulo() {
        new Produto(null);
    }
}

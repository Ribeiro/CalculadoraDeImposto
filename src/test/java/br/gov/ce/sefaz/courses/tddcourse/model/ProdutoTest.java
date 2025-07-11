package br.gov.ce.sefaz.courses.tddcourse.model;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProdutoTest {

    @Test
    void DeveCriarProdutoComValorPositivo() {
        BigDecimal valor = new BigDecimal("150.00");
        Produto produto = new Produto(valor);
        assertThat(produto.getValor(), equalTo(valor));
    }

    @Test
    void DeveCriarProdutoComValorZero() {
        BigDecimal valorZero = BigDecimal.ZERO;
         IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Produto(valorZero));
        assertThat(ex.getMessage(), is("O valor do produto não pode ser zero ou negativo"));
    }

    @Test
    void DeveLancarExcecaoQuandoValorForNegativo() {
        BigDecimal valorNegativo = new BigDecimal("-10.00");
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Produto(valorNegativo));
        assertThat(ex.getMessage(), is("O valor do produto não pode ser zero ou negativo"));
    }

    @Test
    void DeveLancarExcecaoQuandoValorForNulo() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Produto(null));
        assertThat(ex.getMessage(), is("O valor do produto não pode ser nulo"));
    }
}

package br.gov.ce.sefaz.courses.tddcourse.model;

import br.gov.ce.sefaz.courses.tddcourse.fixture.ProdutoFixture;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigDecimal;

class ProdutoTest {

    @Test
    void DeveCriarProdutoComValorPositivo() {
        Produto produto = ProdutoFixture.valido();
        assertThat(produto.getValor(), equalTo(ProdutoFixture.valorPositivo()));
    }

    @Test
    void DeveLancarExcecaoQuandoValorForZero() {
        BigDecimal valorZero = ProdutoFixture.valorZero();
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> ProdutoFixture.comValor(valorZero)
        );
        assertThat(ex.getMessage(), is("O valor do produto não pode ser zero ou negativo"));
    }

    @Test
    void DeveLancarExcecaoQuandoValorForNegativo() {
        BigDecimal valorNegativo = ProdutoFixture.valorNegativo();
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> ProdutoFixture.comValor(valorNegativo)
        );
        assertThat(ex.getMessage(), is("O valor do produto não pode ser zero ou negativo"));
    }

    @Test
    void DeveLancarExcecaoQuandoValorForNulo() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> ProdutoFixture.comValor(null)
        );
        assertThat(ex.getMessage(), is("O valor do produto não pode ser nulo"));
    }
}

package br.gov.ce.sefaz.courses.tddcourse.fixture;

import br.gov.ce.sefaz.courses.tddcourse.model.Produto;
import java.math.BigDecimal;

public class ProdutoFixture {

    public static Produto comValor(BigDecimal valor) {
        return new Produto(valor);
    }

    public static Produto valido() {
        return new Produto(new BigDecimal("150.00"));
    }

    public static BigDecimal valorPositivo() {
        return new BigDecimal("150.00");
    }

    public static BigDecimal valorZero() {
        return BigDecimal.ZERO;
    }

    public static BigDecimal valorNegativo() {
        return new BigDecimal("-10.00");
    }

    public static Produto deDuzentosReais() {
        return new Produto(new BigDecimal("200.00"));
    }

    public static BigDecimal valorEsperadoICMS() {
        return new BigDecimal("34.00");
    }

    public static BigDecimal valorEsperadoIPI() {
        return new BigDecimal("40.00");
    }

    public static BigDecimal valorEsperadoNovoImposto() {
        return new BigDecimal("24.00");
    }
}

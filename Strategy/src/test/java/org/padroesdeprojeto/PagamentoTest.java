package org.padroesdeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveRealizarPagamentoViaPix() {
        Pagamento pagamento = new Pagamento();
        pagamento.setMetodoPagamento(new PagamentoPix());
        assertEquals("Pagamento de R$ 100.0 realizado via Pix.", pagamento.realizarPagamento(100.0f));
    }

    @Test
    void deveRealizarPagamentoViaCartaoCredito() {
        Pagamento pagamento = new Pagamento();
        pagamento.setMetodoPagamento(new PagamentoCartaoCredito());
        assertEquals("Pagamento de R$ 100.0 realizado via Cartão de Crédito.", pagamento.realizarPagamento(100.0f));
    }

    @Test
    void deveRealizarPagamentoViaCartaoDebito() {
        Pagamento pagamento = new Pagamento();
        pagamento.setMetodoPagamento(new PagamentoCartaoDebito());
        assertEquals("Pagamento de R$ 100.0 realizado via Cartão de Débito.", pagamento.realizarPagamento(100.0f));
    }

    @Test
    void deveRealizarPagamentoEmDinheiro() {
        Pagamento pagamento = new Pagamento();
        pagamento.setMetodoPagamento(new PagamentoDinheiro());
        assertEquals("Pagamento de R$ 100.0 realizado em Dinheiro.", pagamento.realizarPagamento(100.0f));
    }
}
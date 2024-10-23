package org.padroesdeprojeto;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public String processarPagamento(float valor) {
        return "Pagamento de R$ " + valor + " realizado via Cartão de Crédito.";
    }
}
package org.padroesdeprojeto;

public class PagamentoDinheiro implements MetodoPagamento {
    @Override
    public String processarPagamento(float valor) {
        return "Pagamento de R$ " + valor + " realizado em Dinheiro.";
    }
}
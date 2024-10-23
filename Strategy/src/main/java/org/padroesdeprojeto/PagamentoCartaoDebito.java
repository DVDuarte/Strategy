package org.padroesdeprojeto;


public class PagamentoCartaoDebito implements MetodoPagamento {
    @Override
    public String processarPagamento(float valor) {
        return "Pagamento de R$ " + valor + " realizado via Cartão de Débito.";
    }
}

package org.padroesdeprojeto;

public class PagamentoPix implements MetodoPagamento {
    @Override
    public String processarPagamento(float valor) {
        return "Pagamento de R$ " + valor + " realizado via Pix.";
    }
}
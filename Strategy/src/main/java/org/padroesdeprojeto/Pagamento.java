package org.padroesdeprojeto;

public class Pagamento {
    private MetodoPagamento metodoPagamento;

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String realizarPagamento(float valor) {
        return metodoPagamento.processarPagamento(valor);
    }
}

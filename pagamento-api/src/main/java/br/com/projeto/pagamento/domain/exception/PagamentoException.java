package br.com.projeto.pagamento.domain.exception;

public class PagamentoException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public PagamentoException(Long pagamentoId) {
        super(String.format("Pagamento de ID: %d, não encontrado", pagamentoId));
    }

    public PagamentoException(String msg, Long carrinhoId) {
        super(String.format(msg, carrinhoId));
    }

}

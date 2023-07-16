package br.com.projeto.carrinho.domain.exception;

public class ProdutoException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public ProdutoException(Long id) {
        super(String.format("Produto de ID: %d, não foi encontrado!", id));
    }

}

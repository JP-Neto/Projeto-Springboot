package br.com.projeto.carrinho.domain.exception;

public class CarrinhoException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public CarrinhoException(Long carrinhoId) {
        super(String.format("Carrinho de ID: %d, não foi encontrado", carrinhoId));
    }

}

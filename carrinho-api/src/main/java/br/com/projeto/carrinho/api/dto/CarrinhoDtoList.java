package br.com.projeto.carrinho.api.dto;

import br.com.projeto.carrinho.domain.entity.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarrinhoDtoList {
    
    private Long id;
    private Status status;
    private ProdutoDtoList produto;
    
}

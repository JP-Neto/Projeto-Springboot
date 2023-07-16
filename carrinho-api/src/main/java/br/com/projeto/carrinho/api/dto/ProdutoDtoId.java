package br.com.projeto.carrinho.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDtoId {

    @NotNull
    private Long id;
 
}

package br.com.projeto.carrinho.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDtoForm {

    @NotBlank
    private String nome;
    
    @Positive
    private Long qtde;
    
    @NotBlank
    private String descricao;
    
}

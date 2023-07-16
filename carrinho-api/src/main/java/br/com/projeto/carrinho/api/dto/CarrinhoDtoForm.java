package br.com.projeto.carrinho.api.dto;

import br.com.projeto.carrinho.domain.entity.Status;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarrinhoDtoForm {
    
    private Status status = Status.CRIADO;

    @NotNull
    private ProdutoDtoId produto;
    
}

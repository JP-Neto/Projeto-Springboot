package br.com.projeto.pagamento.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.projeto.pagamento.domain.entity.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDtoForm {

    @Positive
    private BigDecimal valor;
    
    @NotBlank
    private String nome;
    
    @NotBlank
    private String numeroCartao;    

    @NotNull
    private LocalDate expiracaoCartao;    
   
    @NotBlank
    private String codigo;    

    private Status status = Status.CRIADO;    
    
    @NotNull
    private Long carrinhoId;
    
}

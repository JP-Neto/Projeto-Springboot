package br.com.projeto.pagamento.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.projeto.pagamento.domain.entity.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDtoList {

    private Long id;    
    private BigDecimal valor;    
    private String nome;    
    private String numeroCartao;    
    private LocalDate expiracaoCartao;    
    private String codigo;    
    private Status status;    
    private Long carrinhoId;
    
}

package br.com.projeto.pagamento.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pagamento")
public class Pagamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private BigDecimal valor;
    
    private String nome;
    
    private String numeroCartao;
    
    private LocalDate expiracaoCartao;
    
    private String codigo;
    
    @Enumerated(EnumType.STRING)
    private Status status;
    
    private Long carrinhoId;
    
    public void alterarStatusConfirmado() {
        this.setStatus(Status.CONFIRMADO);
    }

    public void alterarStatusCancelado() {
        this.setStatus(Status.CANCELADO);
    }
    
}

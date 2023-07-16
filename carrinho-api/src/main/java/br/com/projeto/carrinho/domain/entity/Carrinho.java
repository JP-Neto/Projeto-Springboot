package br.com.projeto.carrinho.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "carrinho")
public class Carrinho {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @ManyToOne
    private Produto produto;
    
    public void alterarStatusConfirmado() {
        this.setStatus(Status.CONFIRMADO);
    }

    public void alterarStatusCancelado() {
        this.setStatus(Status.CANCELADO);
    }
    
}

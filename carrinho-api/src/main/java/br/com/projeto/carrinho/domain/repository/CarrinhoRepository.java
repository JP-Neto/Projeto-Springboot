package br.com.projeto.carrinho.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.carrinho.domain.entity.Carrinho;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>{

}

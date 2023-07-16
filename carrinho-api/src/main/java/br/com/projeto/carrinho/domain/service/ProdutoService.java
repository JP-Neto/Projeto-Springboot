package br.com.projeto.carrinho.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.carrinho.domain.entity.Produto;
import br.com.projeto.carrinho.domain.exception.ProdutoException;
import br.com.projeto.carrinho.domain.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Transactional
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    
    @Transactional
    public void remover(Long produtoId) {
        Produto  produto = this.buscarOuFalhar(produtoId);
        
        produtoRepository.delete(produto);
    }
    
    public Produto buscarOuFalhar(Long produtoId) {
        return produtoRepository.findById(produtoId)
                .orElseThrow(() -> new ProdutoException(produtoId));
    }
    
}

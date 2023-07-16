package br.com.projeto.carrinho.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.carrinho.domain.entity.Carrinho;
import br.com.projeto.carrinho.domain.exception.CarrinhoException;
import br.com.projeto.carrinho.domain.external.PagamentoClient;
import br.com.projeto.carrinho.domain.repository.CarrinhoRepository;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;
    
    @Autowired
    private PagamentoClient pagamentoClient;
    
    @Transactional
    public Carrinho salvar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }
    
    @Transactional
    public void alterarStatusConfirmado(Long carrinhoId) {
        Carrinho carrinho = this.buscarOuFalhar(carrinhoId);
        carrinho.alterarStatusConfirmado();
        pagamentoClient.alterarStatusPagamentoConfirmado(carrinhoId);
    }

    @Transactional
    public void alterarStatusCancelado(Long carrinhoId) {
        Carrinho carrinho = this.buscarOuFalhar(carrinhoId);
        carrinho.alterarStatusCancelado();
        pagamentoClient.alterarStatusPagamentoCancelado(carrinhoId);
    }
    
    public Carrinho buscarOuFalhar(Long carrinhoId) {
        return carrinhoRepository.findById(carrinhoId)
                .orElseThrow(() -> new CarrinhoException(carrinhoId));
    }
    
}

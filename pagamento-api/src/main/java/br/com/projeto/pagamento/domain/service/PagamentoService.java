package br.com.projeto.pagamento.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.pagamento.domain.entity.Pagamento;
import br.com.projeto.pagamento.domain.exception.PagamentoException;
import br.com.projeto.pagamento.domain.repository.PagamentoRepository;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;
    
    @Transactional
    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
    
    @Transactional
    public void alterarStatusConfirmado(Long carrinhoId) {
        Pagamento pagamento = this.buscarPagamentoCarrinho(carrinhoId);
        pagamento.alterarStatusConfirmado();
    }

    @Transactional
    public void alterarStatusCancelado(Long carrinhoId) {
        Pagamento carrinho = this.buscarPagamentoCarrinho(carrinhoId);
        carrinho.alterarStatusCancelado();
    }
    
    public Pagamento buscarOuFalhar(Long pagamentoId) {
        return pagamentoRepository.findById(pagamentoId)
                .orElseThrow(() -> new PagamentoException(pagamentoId));
    }
    
    private Pagamento buscarPagamentoCarrinho(Long carrinhoId) {
        return pagamentoRepository.findByCarrinhoId(carrinhoId)
                .orElseThrow(() -> new PagamentoException("Não existe pagamento para o Carrinho de ID: %d", carrinhoId));
    }
    
}

package br.com.projeto.carrinho.domain.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pagamento")
public interface PagamentoClient {

    @RequestMapping(method = RequestMethod.PUT, value = "/pagamentos/{carrinhoId}/confirmado")
    void alterarStatusPagamentoConfirmado(@PathVariable Long carrinhoId);

    @RequestMapping(method = RequestMethod.PUT, value = "/pagamentos/{carrinhoId}/cancelado")
    void alterarStatusPagamentoCancelado(@PathVariable Long carrinhoId);
    
}

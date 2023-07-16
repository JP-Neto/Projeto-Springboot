package br.com.projeto.pagamento.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.pagamento.api.dto.PagamentoDtoList;
import br.com.projeto.pagamento.domain.entity.Pagamento;

@Component
public class PagamentoAssembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public PagamentoDtoList toModel(Pagamento pagamento) {
        return modelMapper.map(pagamento, PagamentoDtoList.class);
    }
    
    public List<PagamentoDtoList> toCollectionModel(List<Pagamento> pagamentos) {
        return pagamentos.stream().map(pagamento -> toModel(pagamento))
                .collect(Collectors.toList());
    }
    
}

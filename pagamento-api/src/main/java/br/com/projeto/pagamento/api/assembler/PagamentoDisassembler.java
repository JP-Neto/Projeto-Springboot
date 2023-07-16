package br.com.projeto.pagamento.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.pagamento.api.dto.PagamentoDtoForm;
import br.com.projeto.pagamento.domain.entity.Pagamento;

@Component
public class PagamentoDisassembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public Pagamento toEntity(PagamentoDtoForm pagamentoDtoForm) {
        return modelMapper.map(pagamentoDtoForm, Pagamento.class);
    }
    
}

package br.com.projeto.carrinho.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.carrinho.api.dto.CarrinhoDtoForm;
import br.com.projeto.carrinho.domain.entity.Carrinho;

@Component
public class CarrinhoDisassembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public Carrinho toEntity(CarrinhoDtoForm carrinhoDtoForm) {
        return modelMapper.map(carrinhoDtoForm, Carrinho.class);
    }
    
}

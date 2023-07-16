package br.com.projeto.carrinho.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.carrinho.api.dto.CarrinhoDtoList;
import br.com.projeto.carrinho.domain.entity.Carrinho;

@Component
public class CarrinhoAssembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public CarrinhoDtoList toModel(Carrinho carrinho) {
        return modelMapper.map(carrinho, CarrinhoDtoList.class);
    }
    
    public List<CarrinhoDtoList> toCollectionModel(List<Carrinho> carrinhos) {
        return carrinhos.stream().map(carrinho -> toModel(carrinho))
                .collect(Collectors.toList());
    }
    
}

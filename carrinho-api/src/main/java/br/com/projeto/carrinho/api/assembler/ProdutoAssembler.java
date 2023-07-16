package br.com.projeto.carrinho.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.carrinho.api.dto.ProdutoDtoList;
import br.com.projeto.carrinho.domain.entity.Produto;

@Component
public class ProdutoAssembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public ProdutoDtoList toModel(Produto produto) {
        return modelMapper.map(produto, ProdutoDtoList.class);
    }
    
    public List<ProdutoDtoList> toCollectionModel(List<Produto> produtos) {
        return produtos.stream().map(produto -> toModel(produto))
                .collect(Collectors.toList());
    }
    
}

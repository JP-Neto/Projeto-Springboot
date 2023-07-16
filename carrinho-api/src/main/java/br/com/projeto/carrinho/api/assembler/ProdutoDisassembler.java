package br.com.projeto.carrinho.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projeto.carrinho.api.dto.ProdutoDtoForm;
import br.com.projeto.carrinho.domain.entity.Produto;

@Component
public class ProdutoDisassembler {

    @Autowired
    private ModelMapper modelMapper;
    
    public Produto toEntity(ProdutoDtoForm produtoDtoForm) {
        return modelMapper.map(produtoDtoForm, Produto.class);
    }
    
    public void toModelEntity(ProdutoDtoForm produtoForm, Produto produto) {
        modelMapper.map(produtoForm, produto);
    }
    
}

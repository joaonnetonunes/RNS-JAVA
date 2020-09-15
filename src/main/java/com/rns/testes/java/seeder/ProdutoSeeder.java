package com.rns.testes.java.seeder;

import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.Produto;
import com.rns.testes.java.service.IFilialService;
import com.rns.testes.java.service.IProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Slf4j
public class ProdutoSeeder {

    @Autowired
    IProdutoService service;

    @Autowired
    IFilialService filialService;

    @EventListener
    public void seedProduto(ContextRefreshedEvent event) {
        try {
            log.info("Criando produtos....");
            criandoProdutos();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private void criandoProdutos() {
        List<Filial> filiais = filialService.findAll();
        Random random = new Random();

        for (int i = 1; i < 50; i++) {
            Produto produto = new Produto();
            produto.setId("Cod-Produto-"+i);
            produto.setNome("Sal produto " + i);
            produto.setFilialId(filiais.get(random.nextInt(filiais.size())).getId());
            service.save(produto);
        }
    }
}

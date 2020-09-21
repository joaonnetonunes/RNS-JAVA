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


        Produto produto1 = new Produto();
        produto1.setId("Cod-Produto-1");
        produto1.setNome("Sal Grosso");
        service.save(produto1);

        Produto produto2 = new Produto();
        produto2.setId("Cod-Produto-2");
        produto2.setNome("Sal Moído Iodado");
        service.save(produto2);

        Produto produto3 = new Produto();
        produto3.setId("Cod-Produto-3");
        produto3.setNome("Sal Rosa do Himalaia");
        service.save(produto3);

        Produto produto4 = new Produto();
        produto4.setId("Cod-Produto-4");
        produto4.setNome("Sal de Parrilla");
        service.save(produto4);

        Produto produto5 = new Produto();
        produto5.setId("Cod-Produto-5");
        produto5.setNome("Flor de Sal");
        service.save(produto5);
    }

}

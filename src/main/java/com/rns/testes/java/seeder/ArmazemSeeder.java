package com.rns.testes.java.seeder;

import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.Armazem;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.service.IFilialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ArmazemSeeder {


    @EventListener
    public void seedArmazem(ContextRefreshedEvent event) {
        try {
            log.info("Criando Armazem....");
            criandoArmazem();
        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }

    private void criandoArmazem() {
        Armazem galpao1 = new Armazem();
        galpao1.setProdutoId("Cod-Produto-1");
        galpao1.setFilialCNPJ("83.230.227/0001-50");
        galpao1.setQuantidade(30);


    }
}

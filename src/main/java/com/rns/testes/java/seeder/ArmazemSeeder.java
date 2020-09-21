package com.rns.testes.java.seeder;

import com.rns.testes.java.model.Armazem;
import com.rns.testes.java.service.IArmazemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ArmazemSeeder {


    @Autowired
    IArmazemService service;


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

        Armazem galpaoSalGrosso1 = new Armazem();
        galpaoSalGrosso1.setProdutoId("Cod-Produto-1");
        galpaoSalGrosso1.setFilialCNPJ("83.230.227/0001-50");
        galpaoSalGrosso1.setQuantidade(30);
        service.save(galpaoSalGrosso1);

        Armazem galpaoSalGrosso2 = new Armazem();
        galpaoSalGrosso2.setProdutoId("Cod-Produto-1");
        galpaoSalGrosso2.setFilialCNPJ("72.286.494/0001-23");
        galpaoSalGrosso2.setQuantidade(45);
        service.save(galpaoSalGrosso2);

        Armazem galpaoSalGrosso3 = new Armazem();
        galpaoSalGrosso3.setProdutoId("Cod-Produto-1");
        galpaoSalGrosso3.setFilialCNPJ("50.935.855/0001-82");
        galpaoSalGrosso3.setQuantidade(40);
        service.save(galpaoSalGrosso3);

        Armazem galpaoSalGrosso4 = new Armazem();
        galpaoSalGrosso4.setProdutoId("Cod-Produto-1");
        galpaoSalGrosso4.setFilialCNPJ("82.602.541/0001-54");
        galpaoSalGrosso4.setQuantidade(28);
        service.save(galpaoSalGrosso4);

        Armazem galpaoSalMoidoIodado1 = new Armazem();
        galpaoSalMoidoIodado1.setProdutoId("Cod-Produto-2");
        galpaoSalMoidoIodado1.setFilialCNPJ("72.286.494/0001-23");
        galpaoSalMoidoIodado1.setQuantidade(60);
        service.save(galpaoSalMoidoIodado1);

        Armazem galpaoSalMoidoIodado2 = new Armazem();
        galpaoSalMoidoIodado2.setProdutoId("Cod-Produto-2");
        galpaoSalMoidoIodado2.setFilialCNPJ("83.230.227/0001-50");
        galpaoSalMoidoIodado2.setQuantidade(57);
        service.save(galpaoSalMoidoIodado2);

        Armazem galpaoSalMoidoIodado3 = new Armazem();
        galpaoSalMoidoIodado3.setProdutoId("Cod-Produto-2");
        galpaoSalMoidoIodado3.setFilialCNPJ("50.935.855/0001-82");
        galpaoSalMoidoIodado3.setQuantidade(95);
        service.save(galpaoSalMoidoIodado3);

        Armazem galpaoSalMoidoIodado4 = new Armazem();
        galpaoSalMoidoIodado4.setProdutoId("Cod-Produto-2");
        galpaoSalMoidoIodado4.setFilialCNPJ("82.602.541/0001-54");
        galpaoSalMoidoIodado4.setQuantidade(62);
        service.save(galpaoSalMoidoIodado4);

        Armazem galpaoSalRosaDoHimalaia1 = new Armazem();
        galpaoSalRosaDoHimalaia1.setProdutoId("Cod-Produto-3");
        galpaoSalRosaDoHimalaia1.setFilialCNPJ("83.230.227/0001-50");
        galpaoSalRosaDoHimalaia1.setQuantidade(75);
        service.save(galpaoSalRosaDoHimalaia1);

        Armazem galpaoSalRosaDoHimalaia2 = new Armazem();
        galpaoSalRosaDoHimalaia2.setProdutoId("Cod-Produto-3");
        galpaoSalRosaDoHimalaia2.setFilialCNPJ("72.286.494/0001-23");
        galpaoSalRosaDoHimalaia2.setQuantidade(110);
        service.save(galpaoSalRosaDoHimalaia2);

        Armazem galpaoSalRosaDoHimalaia3 = new Armazem();
        galpaoSalRosaDoHimalaia3.setProdutoId("Cod-Produto-3");
        galpaoSalRosaDoHimalaia3.setFilialCNPJ("50.935.855/0001-82");
        galpaoSalRosaDoHimalaia3.setQuantidade(49);

        Armazem galpaoSalRosaDoHimalaia4 = new Armazem();
        galpaoSalRosaDoHimalaia4.setProdutoId("Cod-Produto-3");
        galpaoSalRosaDoHimalaia4.setFilialCNPJ("82.602.541/0001-54");
        galpaoSalRosaDoHimalaia4.setQuantidade(120);
        service.save(galpaoSalRosaDoHimalaia4);

        Armazem galpaoSalDeParrilla1 = new Armazem();
        galpaoSalDeParrilla1.setProdutoId("Cod-Produto-4");
        galpaoSalDeParrilla1.setFilialCNPJ("83.230.227/0001-50");
        galpaoSalDeParrilla1.setQuantidade(63);
        service.save(galpaoSalDeParrilla1);

        Armazem galpaoSalDeParrilla2 = new Armazem();
        galpaoSalDeParrilla2.setProdutoId("Cod-Produto-4");
        galpaoSalDeParrilla2.setFilialCNPJ("72.286.494/0001-23");
        galpaoSalDeParrilla2.setQuantidade(85);
        service.save(galpaoSalDeParrilla2);

        Armazem galpaoSalDeParrilla3 = new Armazem();
        galpaoSalDeParrilla3.setProdutoId("Cod-Produto-4");
        galpaoSalDeParrilla3.setFilialCNPJ("50.935.855/0001-82");
        galpaoSalDeParrilla3.setQuantidade(94);
        service.save(galpaoSalDeParrilla3);

        Armazem galpaoSalDeParrilla4 = new Armazem();
        galpaoSalDeParrilla4.setProdutoId("Cod-Produto-4");
        galpaoSalDeParrilla4.setFilialCNPJ("82.602.541/0001-54");
        galpaoSalDeParrilla4.setQuantidade(35);
        service.save(galpaoSalDeParrilla4);

        Armazem galpaoFlordeSal1 = new Armazem();
        galpaoFlordeSal1.setProdutoId("Cod-Produto-5");
        galpaoFlordeSal1.setFilialCNPJ("83.230.227/0001-50");
        galpaoFlordeSal1.setQuantidade(41);
        service.save(galpaoFlordeSal1);

        Armazem galpaoFlordeSal2 = new Armazem();
        galpaoFlordeSal2.setProdutoId("Cod-Produto-5");
        galpaoFlordeSal2.setFilialCNPJ("72.286.494/0001-23");
        galpaoFlordeSal2.setQuantidade(39);
        service.save(galpaoFlordeSal2);

        Armazem galpaoFlordeSal3 = new Armazem();
        galpaoFlordeSal3.setProdutoId("Cod-Produto-5");
        galpaoFlordeSal3.setFilialCNPJ("50.935.855/0001-82");
        galpaoFlordeSal3.setQuantidade(81);
        service.save(galpaoFlordeSal3);

        Armazem galpaoFlordeSal4 = new Armazem();
        galpaoFlordeSal4.setProdutoId("Cod-Produto-5");
        galpaoFlordeSal4.setFilialCNPJ("82.602.541/0001-54");
        galpaoFlordeSal4.setQuantidade(123);
        service.save(galpaoFlordeSal4);
    }
}

package com.rns.testes.java.service.impl;

import com.rns.testes.java.dao.IArmazemDao;
import com.rns.testes.java.dto.TransfereProdutoDto;
import com.rns.testes.java.model.Armazem;
import com.rns.testes.java.service.AbstractGenericServicePersistence;
import com.rns.testes.java.service.IArmazemService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import java.util.List;

@Service
public class ArmazemService extends AbstractGenericServicePersistence<IArmazemDao, Armazem, Long> implements IArmazemService {

    @Override
    public void transferProduct(TransfereProdutoDto dto) {
        List<Armazem> armazemList = findAll();
        Armazem armazemSaida = null;
        Armazem armazemEntrada = null;

        for (Armazem armazemOut : armazemList) {
            if (armazemOut.getFilialCNPJ().equals(dto.getFilialDeOrigemCNPJ()) && armazemOut.getProdutoId().equals(dto.getProdutoId())) {
                armazemSaida = armazemOut;

                armazemSaida.setQuantidade(armazemSaida.getQuantidade() - dto.getQuantidade());
                save(armazemSaida);

                for (Armazem armazemIn : armazemList) {
                    if (armazemIn.getFilialCNPJ().equals(dto.getFilialDeDestinoCNPJ()) && armazemIn.getProdutoId().equals(dto.getProdutoId())) {
                        armazemEntrada = armazemIn;

                        armazemEntrada.setQuantidade(armazemEntrada.getQuantidade() + dto.getQuantidade());
                        save(armazemEntrada);

                        break;
                    }


                }
                break;
            }
        }

        if (armazemEntrada == null){
            throw new NotFoundException();
        }


//      if(armazemSaida == null || armazemSaida.getQuantidade() < dto.getQuantidade()){
//          throw new BadRequestException();
//      }

    }
}
//    private String produtoID;
//    private int quantidade;
//    private int filialDeOrigemId;
//    private int filialDeDestinoId;
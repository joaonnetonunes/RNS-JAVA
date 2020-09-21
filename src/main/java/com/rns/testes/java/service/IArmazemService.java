package com.rns.testes.java.service;

import com.rns.testes.java.dto.TransfereProdutoDto;
import com.rns.testes.java.model.Armazem;

public interface IArmazemService extends IGenericService<Armazem,Long> {

    public void transferProduct(TransfereProdutoDto dto);


}

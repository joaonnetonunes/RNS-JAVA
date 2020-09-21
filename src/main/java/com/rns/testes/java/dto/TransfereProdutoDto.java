package com.rns.testes.java.dto;

import lombok.Data;

@Data
public class TransfereProdutoDto {

    private String produtoId;
    private int quantidade;
    private String filialDeOrigemCNPJ;
    private String filialDeDestinoCNPJ;
}

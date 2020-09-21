package com.rns.testes.java.dto;

import com.rns.testes.java.model.GenericEntity;
import lombok.Data;

@Data
public class ArmazemDto extends GenericEntity<Long> {

    private Long id;
    private String produtoId;
    private String filialCNPJ;
    private int quantidade;
}

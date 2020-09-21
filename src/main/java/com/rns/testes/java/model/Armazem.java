package com.rns.testes.java.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ARMAZEM")
@SequenceGenerator(name = "ARMAZEM_SEQ", sequenceName = "ARMAZEM_SEQ", allocationSize = 1)
@Data
public class Armazem extends GenericEntity<Long> {


    @Id
    @GeneratedValue(generator = "ARMAZEM_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

//    @OneToOne(mappedBy = "id")
    @Column
    private String produtoId;

//    @OneToOne(mappedBy = "CNPJ")
    @Column
    private String filialCNPJ;

    @Column
    private int quantidade;

}

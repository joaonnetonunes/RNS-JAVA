package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.ArmazemDto;
import com.rns.testes.java.model.Armazem;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-20T20:57:18-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_265 (Private Build)"
)
public class ArmazemMapperImpl implements ArmazemMapper {

    @Override
    public ArmazemDto entityToDto(Armazem entity) {
        if ( entity == null ) {
            return null;
        }

        ArmazemDto armazemDto = new ArmazemDto();

        armazemDto.setVersao( entity.getVersao() );
        armazemDto.setDataUltAlteracao( entity.getDataUltAlteracao() );
        armazemDto.setId( entity.getId() );
        armazemDto.setProdutoId( entity.getProdutoId() );
        armazemDto.setFilialCNPJ( entity.getFilialCNPJ() );
        armazemDto.setQuantidade( entity.getQuantidade() );

        return armazemDto;
    }

    @Override
    public Armazem dtoToEntity(ArmazemDto dto) {
        if ( dto == null ) {
            return null;
        }

        Armazem armazem = new Armazem();

        armazem.setVersao( dto.getVersao() );
        armazem.setDataUltAlteracao( dto.getDataUltAlteracao() );
        armazem.setId( dto.getId() );
        armazem.setProdutoId( dto.getProdutoId() );
        armazem.setFilialCNPJ( dto.getFilialCNPJ() );
        armazem.setQuantidade( dto.getQuantidade() );

        return armazem;
    }
}

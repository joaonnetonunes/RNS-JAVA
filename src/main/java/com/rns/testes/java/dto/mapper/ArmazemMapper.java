package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.ArmazemDto;
import com.rns.testes.java.model.Armazem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArmazemMapper extends  GenericMapper<Armazem, ArmazemDto>{

    ArmazemMapper INSTANCE = Mappers.getMapper(ArmazemMapper.class);
}

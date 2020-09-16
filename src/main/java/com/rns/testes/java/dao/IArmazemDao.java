package com.rns.testes.java.dao;

import com.rns.testes.java.model.Armazem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArmazemDao extends JpaRepository<Armazem, Long> {
}

package com.rns.testes.java.controller;

import com.rns.testes.java.dto.ArmazemDto;
import com.rns.testes.java.dto.FilialDto;
import com.rns.testes.java.dto.TransfereProdutoDto;
import com.rns.testes.java.dto.mapper.ArmazemMapper;
import com.rns.testes.java.dto.mapper.FilialMapper;
import com.rns.testes.java.model.Armazem;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.service.IArmazemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class ArmazemController {

    private static final String BASE_URL = "armazem/";

    @Autowired
    IArmazemService service;

    @GetMapping(value = BASE_URL + "find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<Armazem>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = BASE_URL + "find-by-id", produces = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Armazem> findById(@RequestParam(name = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping(value = BASE_URL + "transfer", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> transferProduct(@RequestBody TransfereProdutoDto dto) {
        service.transferProduct(dto);
        return  ResponseEntity.ok("Success");
    }
}

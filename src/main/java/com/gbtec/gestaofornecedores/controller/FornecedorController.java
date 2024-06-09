package com.gbtec.gestaofornecedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gbtec.gestaofornecedores.model.Fornecedor;
import com.gbtec.gestaofornecedores.model.dto.FornecedorDTO;
import com.gbtec.gestaofornecedores.service.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    private final FornecedorService fornecedorService;

    @Autowired
    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }
    @GetMapping
    public ResponseEntity<List<Fornecedor>> listAll(){
        List<Fornecedor> fornecedores = fornecedorService.listAll();
        return ResponseEntity.ok().body(fornecedores);
    }

    @PostMapping
    public ResponseEntity<Fornecedor> criarFornecedor(@RequestBody FornecedorDTO objDTO) {
        Fornecedor novoFornecedor = fornecedorService.save(objDTO);
        return new ResponseEntity<>(novoFornecedor, HttpStatus.CREATED);
    }

}
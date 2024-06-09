package com.gbtec.gestaofornecedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbtec.gestaofornecedores.model.Conta;
import com.gbtec.gestaofornecedores.repository.ContaRepository;

@Service
public class ContaService {
    private final ContaRepository contaRepository;

    @Autowired
    public ContaService(ContaRepository contaRepository){
        this.contaRepository = contaRepository;
    }

    @Transactional
    public List<Conta> all(){
        return contaRepository.findAll();
    }

    public Conta save(Conta conta){
        return contaRepository.save(conta);
    }
}

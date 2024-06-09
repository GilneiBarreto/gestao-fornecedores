package com.gbtec.gestaofornecedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbtec.gestaofornecedores.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
    
}

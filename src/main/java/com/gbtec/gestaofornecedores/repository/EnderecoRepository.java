package com.gbtec.gestaofornecedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbtec.gestaofornecedores.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String>{

}

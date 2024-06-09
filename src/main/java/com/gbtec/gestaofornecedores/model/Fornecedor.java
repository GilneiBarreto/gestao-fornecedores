package com.gbtec.gestaofornecedores.model;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nomeFantasia;
    private TipoFornecedor tipo;
    private String cpfCnpj;
    
    @OneToOne
	private Endereco endereco;
    
    @OneToMany(mappedBy = "fornecedor", fetch= FetchType.EAGER)
    private Set<Conta> contas = new HashSet<>();

    public Fornecedor(){}
    
    public Fornecedor(Long id, String nome, String nomeFantasia, TipoFornecedor tipo, String cpfCnpj, Endereco endereco, Conta conta) {
        this.id = id;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.tipo = tipo;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public TipoFornecedor getTipo() {
        return tipo;
    }

    public void setTipo(TipoFornecedor tipo) {
        this.tipo = tipo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void setContas(Set<Conta> contas) {
        this.contas = contas;
    }

}
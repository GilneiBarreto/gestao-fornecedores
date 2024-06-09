package com.gbtec.gestaofornecedores.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.gbtec.gestaofornecedores.model.TipoFornecedor;

public class FornecedorDTO {
    private String nome;
    private String nomeFantasia;
    private TipoFornecedor tipoFornecedor;
    private String cpfCnpj;
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private Set<ContaDTO> contas = new HashSet<>();

    public FornecedorDTO() {
    }

    public FornecedorDTO(String nome, String nomeFantasia, TipoFornecedor tipoFornecedor, String cpfCnpj, String cep, String logradouro, String complemento, String bairro,
            Set<ContaDTO> contas) {
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.tipoFornecedor = tipoFornecedor;
        this.cpfCnpj = cpfCnpj;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro; 
        this.contas.addAll(contas);
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

    public TipoFornecedor getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(TipoFornecedor tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Set<ContaDTO> getContas() {
        return contas;
    }

    public void setContas(Set<ContaDTO> contas) {
        this.contas = contas;
    }

}

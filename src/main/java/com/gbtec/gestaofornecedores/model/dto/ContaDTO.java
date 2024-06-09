package com.gbtec.gestaofornecedores.model.dto;

import com.gbtec.gestaofornecedores.model.TipoConta;

public class ContaDTO {

    private Long id;
    private String banco;
    private String numero;
    private String agencia;
    private TipoConta tipo;

    public ContaDTO() {

    }

    public ContaDTO(Long id, String banco, String numero, String agencia, TipoConta tipo) {
        this.id = id;
        this.banco = banco;
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }


}
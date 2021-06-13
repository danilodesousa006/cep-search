package com.example.demo;

public class CEP {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;

    public String getCep() {
        return cep;
    }

    public CEP setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public CEP setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public CEP setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public CEP setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getLocalidade() {
        return localidade;
    }

    public CEP setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public String getUf() {
        return uf;
    }

    public CEP setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public String getDdd() {
        return ddd;
    }

    public CEP setDdd(String ddd) {
        this.ddd = ddd;
        return this;
    }
}


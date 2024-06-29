package com.poo.classe;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;

public class Endereco {
    int enderecoId;
    String cidade;
    String tipo;
    String logradouro;
    String complemento;
    
    public int getEnderecoId() {
        return enderecoId;
    }
    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    

}

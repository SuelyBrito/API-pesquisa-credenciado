package com.suely.APIpesquisacredenciado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.OneToMany;
import java.util.List;
@Entity
@Table(name = "tb_lista_credenciado")
public class ListaCredenciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_plano;
    private String descricao_tp_credenciado;
    private String nome_credenciado;
    private String uf;
    private String municipio;
    private String descricaoEndereco;
    private String fone;
    private String descricao_especialidade;

    public ListaCredenciado() {
    }

    public ListaCredenciado(long id, String nome_plano, String descricao_tp_credenciado, String nome_credenciado, String uf, String municipio, String descricaoEndereco, String fone, String descricao_especialidade) {
        this.id = id;
        this.nome_plano = nome_plano;
        this.descricao_tp_credenciado = descricao_tp_credenciado;
        this.nome_credenciado = nome_credenciado;
        this.uf = uf;
        this.municipio = municipio;
        this.descricaoEndereco = descricaoEndereco;
        this.fone = fone;
        this.descricao_especialidade = descricao_especialidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_plano() {
        return nome_plano;
    }

    public void setNome_plano(String nome_plano) {
        this.nome_plano = nome_plano;
    }

    public String getDescricao_tp_credenciado() {
        return descricao_tp_credenciado;
    }

    public void setDescricao_tp_credenciado(String descricao_tp_credenciado) {
        this.descricao_tp_credenciado = descricao_tp_credenciado;
    }

    public String getNome_credenciado() {
        return nome_credenciado;
    }

    public void setNome_credenciado(String nome_credenciado) {
        this.nome_credenciado = nome_credenciado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDescricaoEndereco() {
        return descricaoEndereco;
    }

    public void setDescricaoEndereco(String descricaoEndereco) {
        this.descricaoEndereco = descricaoEndereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDescricao_especialidade() {
        return descricao_especialidade;
    }

    public void setDescricao_especialidade(String descricao_especialidade) {
        this.descricao_especialidade = descricao_especialidade;
    }
}

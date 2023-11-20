package com.suely.APIpesquisacredenciado.controller.dao;

import com.suely.APIpesquisacredenciado.model.ListaCredenciado;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ListaCredenciadoRs {
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

    public ListaCredenciadoRs() {
    }

    public ListaCredenciadoRs(long id, String nome_plano, String descricao_tp_credenciado,
                              String nome_credenciado, String uf, String municipio,
                              String descricaoEndereco, String fone, String descricao_especialidade)
    {
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
    public static ListaCredenciadoRs converter(ListaCredenciado p) {
        var listaCredenciado  = new ListaCredenciadoRs ();
        listaCredenciado.setId (p.getId());
        listaCredenciado.setDescricao_especialidade (p.getDescricao_especialidade ());
        listaCredenciado.setDescricao_tp_credenciado (p.getDescricao_tp_credenciado ());
        listaCredenciado.setDescricaoEndereco (p.getDescricaoEndereco ());
        listaCredenciado.setMunicipio (p.getMunicipio ());
        listaCredenciado.setUf (p.getUf ());
        listaCredenciado.setFone (p.getFone ());
        listaCredenciado.setNome_plano (p.getNome_plano ());
        listaCredenciado.setNome_credenciado (p.getNome_credenciado ());
        System.out.println ("Imprimir lista" +listaCredenciado);
        return listaCredenciado;
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

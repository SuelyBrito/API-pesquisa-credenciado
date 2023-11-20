package com.suely.APIpesquisacredenciado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.OneToMany;
import java.util.List;
@Entity
@Table(name = "tb_endereco_credenciado")
public class EnderecoCredenciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_credenciado")
    private Long idEnderecoCredenciado;
    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name="id_credenciado")
    private Credenciado credenciado;


    String uf;
    String municipio;
    String descricaoEndereco;
    String fone;

    public EnderecoCredenciado() {
    }

    public Long getIdEnderecoCredenciado() {
        return idEnderecoCredenciado;
    }

    public void setIdEnderecoCredenciado(Long idEnderecoCredenciado) {
        this.idEnderecoCredenciado = idEnderecoCredenciado;
    }

    public Credenciado getCredenciado() {
        return credenciado;
    }

    public void setCredenciado(Credenciado credenciado) {
        this.credenciado = credenciado;
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
}
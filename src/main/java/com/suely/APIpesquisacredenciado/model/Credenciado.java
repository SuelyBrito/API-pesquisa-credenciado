package com.suely.APIpesquisacredenciado.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "tb_credenciado")
public class Credenciado {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private int tipo_credenciado;


    @OneToMany
    @PrimaryKeyJoinColumn(name = "id_credenciado")
    @PrimaryKeyJoinColumn(name="id")
    private  List<CredPlanos> credPlanos;
    @OneToMany
    @PrimaryKeyJoinColumn(name="id_endereco_credenciado")
    private List<EnderecoCredenciado> enderecoCredenciados;

    @Id
    @OneToMany
    @PrimaryKeyJoinColumn(name = "id")
    private  List<CredEspecialidade> credEspecialidade;
    public Credenciado() {
    }

    public Credenciado(Long id, String nome, List<ListaCredenciado> lista, List<CredPlanos> credPlanos, List<EnderecoCredenciado> enderecoCredenciados, List<CredEspecialidade> credEspecialidade) {
        this.id = id;
        this.nome = nome;

        this.credPlanos = credPlanos;
        this.enderecoCredenciados = enderecoCredenciados;
        this.credEspecialidade = credEspecialidade;
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



    public List<CredPlanos> getCredPlanos() {
        return credPlanos;
    }

    public void setCredPlanos(List<CredPlanos> credPlanos) {
        this.credPlanos = credPlanos;
    }

    public List<EnderecoCredenciado> getEnderecoCredenciados() {
        return enderecoCredenciados;
    }

    public void setEnderecoCredenciados(List<EnderecoCredenciado> enderecoCredenciados) {
        this.enderecoCredenciados = enderecoCredenciados;
    }

    public List<CredEspecialidade> getCredEspecialidade() {
        return credEspecialidade;
    }

    public void setCredEspecialidade(List<CredEspecialidade> credEspecialidade) {
        this.credEspecialidade = credEspecialidade;
    }
}



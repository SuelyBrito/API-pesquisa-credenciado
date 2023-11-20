package com.suely.APIpesquisacredenciado.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_especialidade")
public class Especialidades {
    @Id
    @GeneratedValue
    private int id_especialidade;
    private String descricao_esp;

    @Id
    @OneToMany()
    @PrimaryKeyJoinColumn(name="id")
    private List<CredEspecialidade> credEspecialidade;
    public Especialidades(int id, String descricao_esp) {
        this.id_especialidade = id;
        this.descricao_esp = descricao_esp;
    }

    public int getId() {
        return id_especialidade;
    }

    public String getDescricao_esp() {
        return descricao_esp;
    }
}

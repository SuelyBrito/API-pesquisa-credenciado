package com.suely.APIpesquisacredenciado.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_cred_especialidade")
public class CredEspecialidade {
    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_credenciado")
    private  Credenciado credenciado;
    @Id
    @ManyToOne()
    @PrimaryKeyJoinColumn(name="id_especialidade")
    private Especialidades especialidades;

    public CredEspecialidade(Credenciado credenciado, Especialidades especialidades) {
        this.credenciado = credenciado;
        this.especialidades = especialidades;
    }

    public CredEspecialidade() {
    }

    public Credenciado getCredenciado() {
        return credenciado;
    }

    public void setCredenciado(Credenciado credenciado) {
        this.credenciado = credenciado;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }
}
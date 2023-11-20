package com.suely.APIpesquisacredenciado.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_cred_planos")
public class CredPlanos {
    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id_credenciado")
    private  Credenciado credenciado;
    @Id
    @ManyToOne()
    @PrimaryKeyJoinColumn(name="id_planos")
    private TiposPlanos tiposPlanos;

    public CredPlanos(Credenciado credenciado, TiposPlanos tiposPlanos) {
        this.credenciado = credenciado;
        this.tiposPlanos = tiposPlanos;
    }
}
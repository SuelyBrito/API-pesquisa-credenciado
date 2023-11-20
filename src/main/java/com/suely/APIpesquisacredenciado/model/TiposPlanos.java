package com.suely.APIpesquisacredenciado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_tp_planos")
public class TiposPlanos {
    @Id
    @GeneratedValue
    private int id_planos;
    private String descricao_tp_planos;

    public TiposPlanos(int id, String descricao_tp_planos) {
        this.id_planos = id_planos;
        this.descricao_tp_planos = descricao_tp_planos;
    }

    public int getId() {
        return id_planos;
    }

    public String getDescricao_tp_planos() {
        return descricao_tp_planos;
    }
}
package com.suely.APIpesquisacredenciado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_tp_credenciados")
public class TiposCredenciados {
    @Id
    @GeneratedValue
    private int id_tipo_credenciado;
    private String descricao_tp_credenciado;
}
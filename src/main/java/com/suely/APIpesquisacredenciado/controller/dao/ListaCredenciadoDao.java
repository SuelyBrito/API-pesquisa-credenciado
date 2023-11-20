package com.suely.APIpesquisacredenciado.controller.dao;

import com.suely.APIpesquisacredenciado.model.ListaCredenciado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListaCredenciadoDao {
    @PersistenceContext
    private EntityManager em;
    public List<ListaCredenciado>customQuery(String descricao_tp_planos, String descricao_tp_credenciado,
                                             String uf,String municipio, String descricao_esp) {
        String query = " insert into tb_lista_credenciado  ( \n" +
                "        nome_plano,\n" +
                "        descricao_tp_credenciado,\n" +
                "        nome_credenciado,\n" +
                "        uf,\n" +
                "        municipio,\n" +
                "        descricao_endereco,\n" +
                "        fone,\n" +
                "        descricao_especialidade)\n" +
                "\t\t\n" +
                "\t\t(Select  t2.descricao_tp_planos,t3.descricao_tp_credenciado,t1.nome,t4.uf,t4.municipio,\n" +
                "\t\tt4.descricao_endereco,t4.fone,t5.descricao_esp  from\n" +
                "\t\t\n" +
                "\t\ttb_credenciado  t1 ,\n" +
                "\t\ttb_tp_planos t2 ,\n" +
                "\t\ttb_tp_credenciados t3 ,\n" +
                "\t    tb_endereco_credenciado t4 ,\n" +
                "\t\ttb_especialidade t5 ,\n" +
                "\t    tb_cred_planos t6 ,\n" +
                "\t\ttb_cred_especialidade t7 \n" +
                "\t\t\n" +
                "\t\twhere \n" +
                "\t\tt1.id = t6.credenciado_id and   \n" +
                "\t\tt6.tipos_planos_id_planos = t2.id_planos and\n" +
                "\t\tt1.tipo_credenciado= t3.id_tipo_credenciado and\n" +
                "\t\tt1.id = t4.credenciado_id and\n" +
                "\t\tt1.id = t7.credenciado_id and \n" +
                "\t\tt7.especialidades_id_especialidade = t5.id_especialidade\n" +
         //       "                and t2.descrição_tp_planos = : descricao_tp_plano and \n" +
         //       "                t3.descricao_tp_credenciado =: descricao_tp_credenciado and \n" +
         //       "                t4.uf = :uf and \n" +
         //       "                t4.municipio =:municipio and \n" +
         //       "                t5.descricao_esp = :descricao_esp)";
                "                and t2.descrição_tp_planos = : 'Basico' and \n" +
                       "                t3.descricao_tp_credenciado =: 'Consultorio' and \n" +
                     "                t4.uf = : 'SP' and \n" +
                    "                t4.municipio =:'São Paulo' and \n" +
                      "                t5.descricao_esp = :'Cardiologia')";
        TypedQuery<ListaCredenciado> typedQuery = em.createQuery (query,ListaCredenciado.class);
        System.out.println ("Executando Querye");
         return  typedQuery.getResultList ();
    }

}



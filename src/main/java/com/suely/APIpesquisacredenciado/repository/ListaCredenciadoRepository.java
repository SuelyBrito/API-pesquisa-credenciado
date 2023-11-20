package com.suely.APIpesquisacredenciado.repository;

import com.suely.APIpesquisacredenciado.model.ListaCredenciado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ListaCredenciadoRepository extends JpaRepository<ListaCredenciado, Integer>
{

   // List<ListaCredenciado> findByParametros(Integer id_plano,String UF,String Municipio,Integer id_tp_prestador,
   //      Integer id_especialidade  );

  //  List<ListaCredenciado> findById();



}

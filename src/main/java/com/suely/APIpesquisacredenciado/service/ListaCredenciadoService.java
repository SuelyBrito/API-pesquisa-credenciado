package com.suely.APIpesquisacredenciado.service;

import com.suely.APIpesquisacredenciado.model.ListaCredenciado;
import com.suely.APIpesquisacredenciado.repository.ListaCredenciadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaCredenciadoService
{
    @Autowired
    private ListaCredenciadoRepository listaCredenciadoRepository;

    public List<ListaCredenciado> findAll() {
        return listaCredenciadoRepository.findAll();
    }



}



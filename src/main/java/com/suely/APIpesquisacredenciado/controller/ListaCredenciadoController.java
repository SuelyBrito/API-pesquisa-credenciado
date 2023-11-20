package com.suely.APIpesquisacredenciado.controller;
import com.suely.APIpesquisacredenciado.controller.dao.ListaCredenciadoRs;
import com.suely.APIpesquisacredenciado.repository.ListaCredenciadoRepository;
import com.suely.APIpesquisacredenciado.service.ListaCredenciadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/credenciados")
public class ListaCredenciadoController {
    @Autowired
    private ListaCredenciadoService listaCredenciadoService;
    private final ListaCredenciadoRepository listaCredenciadoRepository;

    public ListaCredenciadoController(ListaCredenciadoService listaCredenciadoService, ListaCredenciadoRepository listaCredenciadoRepository) {
        this.listaCredenciadoService = listaCredenciadoService;
        this.listaCredenciadoRepository = listaCredenciadoRepository;
    }

    @GetMapping("/")
    public List<ListaCredenciadoRs> findAll() {
        var listaCredenciados = listaCredenciadoRepository.findAll();
        return listaCredenciados
                .stream()
                .map(ListaCredenciadoRs::converter)
                .collect(Collectors.toList());
    }




}





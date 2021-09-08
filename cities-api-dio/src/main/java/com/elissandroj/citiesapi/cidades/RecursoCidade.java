package com.elissandroj.citiesapi.cidades;

import com.elissandroj.citiesapi.repositorios.RepositorioCidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
public class RecursoCidade {

    private RepositorioCidade repositorioCidade;

    public RecursoCidade(RepositorioCidade repositorioCidade){

        this.repositorioCidade = repositorioCidade;
    }

    @GetMapping
    public Page<Cidade> listarEstados(Pageable pageable){

        return repositorioCidade.findAll(pageable);
    }
}

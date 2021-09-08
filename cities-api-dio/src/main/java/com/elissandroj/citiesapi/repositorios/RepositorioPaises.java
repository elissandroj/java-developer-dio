package com.elissandroj.citiesapi.repositorios;

import com.elissandroj.citiesapi.paises.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositorioPaises extends JpaRepository<Pais, Long>, JpaSpecificationExecutor<Pais> {

}

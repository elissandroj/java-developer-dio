package com.elissandroj.citiesapi.repositorios;

import com.elissandroj.citiesapi.estados.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEstado extends JpaRepository<Estado, Long> {

}

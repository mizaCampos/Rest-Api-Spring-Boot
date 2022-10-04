package com.comerciosapi.comercioapo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comerciosapi.comercioapo.models.Comercio;

@Repository
public interface ComercioRepository extends JpaRepository<Comercio, Long> {

    Iterable<Comercio> findByCategoria(String categoria);

    Iterable<Comercio> findByCidade(String cidade);
    
    Iterable<Comercio> findByBairro(String bairro);
    
}

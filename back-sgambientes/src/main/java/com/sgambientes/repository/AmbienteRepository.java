package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.Ambiente;


@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Long>{

}

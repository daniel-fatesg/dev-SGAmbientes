package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}

package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Long>{

}

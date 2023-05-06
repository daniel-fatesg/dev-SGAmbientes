package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.Regra;

@Repository
public interface RegraRepository extends JpaRepository<Regra, Long>{

}

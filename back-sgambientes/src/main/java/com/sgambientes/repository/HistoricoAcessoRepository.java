package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.HistoricoAcesso;

@Repository
public interface HistoricoAcessoRepository extends JpaRepository<HistoricoAcesso, Long>{

}

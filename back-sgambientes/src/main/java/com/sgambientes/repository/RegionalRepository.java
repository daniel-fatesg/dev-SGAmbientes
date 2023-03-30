package com.sgambientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgambientes.entities.Regional;

@Repository
public interface RegionalRepository extends JpaRepository<Regional, Long>{

}

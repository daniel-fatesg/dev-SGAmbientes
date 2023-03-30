package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Regra;
import com.sgambientes.repository.RegraRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class RegraService {
	
private final RegraRepository repository;
	
	@Autowired
	public RegraService(RegraRepository repository) {
		this.repository=repository;
	}
	
	public List<Regra> findAll(){
		return repository.findAll();
	}
	
	public Regra findById(Long id) {
		Optional<Regra> obj= repository.findById(id);
		return obj.get();
	}
	
	public Regra insert(Regra obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException();
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	public Regra atualizar(Long id, Regra obj) {
		Regra entidade= repository.getReferenceById(id);
		updateDadoRegra(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoRegra(Regra entidade, Regra obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		
	}

}

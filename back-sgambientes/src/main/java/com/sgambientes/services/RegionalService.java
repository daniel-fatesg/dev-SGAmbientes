package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Regional;
import com.sgambientes.repository.RegionalRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class RegionalService {
	
private final RegionalRepository repository;
	
	@Autowired
	public RegionalService(RegionalRepository repository) {
		this.repository=repository;
	}
	
	public List<Regional> findAll(){
		return repository.findAll();
	}
	
	public Regional findById(Long id) {
		Optional<Regional> obj= repository.findById(id);
		return obj.get();
	}
	
	public Regional insert(Regional obj) {
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
	
	public Regional atualizar(Long id, Regional obj) {
		Regional entidade= repository.getReferenceById(id);
		updateDadoRegional(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoRegional(Regional entidade, Regional obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		
	}

}

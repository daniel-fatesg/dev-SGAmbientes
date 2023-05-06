package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Bloco;
import com.sgambientes.repository.BlocoRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class BlocoService {
	
private final BlocoRepository repository;
	
	@Autowired
	public BlocoService(BlocoRepository repository) {
		this.repository=repository;
	}
	
	public List<Bloco> findAll(){
		return repository.findAll();
	}
	
	public Bloco findById(Long id) {
		Optional<Bloco> obj= repository.findById(id);
		return obj.get();
	}
	
	public Bloco insert(Bloco obj) {
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
	
	public Bloco atualizar(Long id, Bloco obj) {
		Bloco entidade= repository.getReferenceById(id);
		updateDadoBloco(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoBloco(Bloco entidade, Bloco obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		
	}

}

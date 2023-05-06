package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Permissoes;
import com.sgambientes.repository.PermissoesRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class PermissoesService {
	
	private final PermissoesRepository repository;
	
	@Autowired
	public PermissoesService(PermissoesRepository repository) {
		this.repository=repository;
	}
	
	public List<Permissoes> findAll(){
		return repository.findAll();
	}
	
	public Permissoes findById(Long id) {
		Optional<Permissoes> obj= repository.findById(id);
		return obj.get();
	}
	
	public Permissoes insert(Permissoes obj) {
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
	
	public Permissoes atualizar(Long id, Permissoes obj) {
		Permissoes entidade= repository.getReferenceById(id);
		updateDadoPermissoes(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoPermissoes(Permissoes entidade, Permissoes obj) {
		entidade.setId(obj.getId());
		entidade.setDescricao(obj.getDescricao());
		entidade.setValor(obj.getValor());
		
	}

}

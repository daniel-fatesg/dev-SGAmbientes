package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Perfil;
import com.sgambientes.repository.PerfilRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class PerfilService {
	
private final PerfilRepository repository;
	
	@Autowired
	public PerfilService(PerfilRepository repository) {
		this.repository=repository;
	}
	
	public List<Perfil> findAll(){
		return repository.findAll();
	}
	
	public Perfil findById(Long id) {
		Optional<Perfil> obj= repository.findById(id);
		return obj.get();
	}
	
	public Perfil insert(Perfil obj) {
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
	
	public Perfil atualizar(Long id, Perfil obj) {
		Perfil entidade= repository.getReferenceById(id);
		updateDadoPerfil(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoPerfil(Perfil entidade, Perfil obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		
	}

}

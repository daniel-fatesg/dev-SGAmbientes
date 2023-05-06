package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Unidade;
import com.sgambientes.repository.UnidadeRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class UnidadeService {
	
private final UnidadeRepository repository;
	
	@Autowired
	public UnidadeService(UnidadeRepository repository) {
		this.repository=repository;
	}
	
	public List<Unidade> findAll(){
		return repository.findAll();
	}
	
	public Unidade findById(Long id) {
		Optional<Unidade> obj= repository.findById(id);
		return obj.get();
	}
	
	public Unidade insert(Unidade obj) {
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
	
	public Unidade atualizar(Long id, Unidade obj) {
		Unidade entidade= repository.getReferenceById(id);
		updateDadoUnidade(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoUnidade(Unidade entidade, Unidade obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		entidade.setLocalizacao(obj.getLocalizacao());
		entidade.setTelefone(obj.getTelefone());
	}

}

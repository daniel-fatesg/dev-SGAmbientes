package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Ambiente;
import com.sgambientes.repository.AmbienteRepository;
import com.sgambientes.services.exceptions.DatabaseException;



@Service
public class AmbienteService {
	
private final AmbienteRepository repository;
	
	@Autowired
	public AmbienteService(AmbienteRepository repository) {
		this.repository=repository;
	}
	
	public List<Ambiente> findAll(){
		return repository.findAll();
	}
	
	public Ambiente findById(Long id) {
		Optional<Ambiente> obj= repository.findById(id);
		return obj.get();
	}
	
	public Ambiente insert(Ambiente obj) {
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
	
	public Ambiente atualizar(Long id, Ambiente obj) {
		Ambiente entidade= repository.getReferenceById(id);
		updateDadoAmbiente(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoAmbiente(Ambiente entidade, Ambiente obj) {
		entidade.setId(obj.getId());
		entidade.setArea(obj.getArea());
		entidade.setBloco(obj.getBloco());		
		entidade.setCapacidade(obj.getCapacidade());
		entidade.setNumero(obj.getNumero());		
		entidade.setIpCamera(obj.getIpCamera());
		entidade.setTipoAmbiente(obj.getTipoAmbiente());
		entidade.setUnidlnstitucional(obj.getUnidlnstitucional());
		entidade.setTotalPessoa(obj.getTotalPessoa());
		entidade.setTotalComputador(obj.getTotalComputador());
	}

}

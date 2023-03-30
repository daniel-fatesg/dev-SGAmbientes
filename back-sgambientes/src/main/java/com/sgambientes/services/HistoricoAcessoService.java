package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.HistoricoAcesso;
import com.sgambientes.repository.HistoricoAcessoRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class HistoricoAcessoService {

private final HistoricoAcessoRepository repository;
	
	@Autowired
	public HistoricoAcessoService(HistoricoAcessoRepository repository) {
		this.repository=repository;
	}
	
	public List<HistoricoAcesso> findAll(){
		return repository.findAll();
	}
	
	public HistoricoAcesso findById(Long id) {
		Optional<HistoricoAcesso> obj= repository.findById(id);
		return obj.get();
	}
	
	public HistoricoAcesso insert(HistoricoAcesso obj) {
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
	
	public HistoricoAcesso atualizar(Long id, HistoricoAcesso obj) {
		HistoricoAcesso entidade= repository.getReferenceById(id);
		updateDadoHistoricoAcesso(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoHistoricoAcesso(HistoricoAcesso entidade, HistoricoAcesso obj) {
		entidade.setId(obj.getId());
		entidade.setDtEntrada(obj.getDtEntrada());
		entidade.setDtSaida(obj.getDtSaida());
		
	}
}

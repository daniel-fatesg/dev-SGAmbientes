package com.sgambientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sgambientes.entities.Usuario;
import com.sgambientes.repository.UsuarioRepository;
import com.sgambientes.services.exceptions.DatabaseException;

@Service
public class UsuarioService {
	
private final UsuarioRepository repository;
	
	@Autowired
	public UsuarioService(UsuarioRepository repository) {
		this.repository=repository;
	}
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj= repository.findById(id);
		return obj.get();
	}
	
	public Usuario insert(Usuario obj) {
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
	
	public Usuario atualizar(Long id, Usuario obj) {
		Usuario entidade= repository.getReferenceById(id);
		updateDadoUsuario(entidade, obj);
		return repository.save(entidade);
	}

	private void updateDadoUsuario(Usuario entidade, Usuario obj) {
		entidade.setId(obj.getId());
		entidade.setNome(obj.getNome());
		entidade.setCelular(obj.getCelular());
		entidade.setEmail(obj.getEmail());
		entidade.setSenha(obj.getSenha());
		entidade.setCodRFID(obj.getCodRFID());
		entidade.setToken(obj.getToken());
		entidade.setStatus(obj.isStatus());
		
	}

}

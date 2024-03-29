package com.sgambientes.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sgambientes.entities.Ambiente;
import com.sgambientes.services.AmbienteService;


public class AmbienteControle {
	
	private final AmbienteService service;
	
	@Autowired
	public AmbienteControle(@Lazy AmbienteService service) {
		this.service=service;
	}
	
	@GetMapping
	public ResponseEntity<List<Ambiente>> findAll(){
		List<Ambiente> list= service.findAll();
		return ResponseEntity.ok().body(list);			
				
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Ambiente> findById(@PathVariable Long id){
		Ambiente u= service.findById(id);
		return ResponseEntity.ok().body(u);
	}
	
	@PostMapping
	public ResponseEntity<Ambiente> insert(@RequestBody Ambiente obj){
		obj=service.insert(obj);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Ambiente> update(@PathVariable Long id, @RequestBody Ambiente obj){
		obj= service.atualizar(id, obj);		
		return ResponseEntity.ok().body(obj);
		
	}

}

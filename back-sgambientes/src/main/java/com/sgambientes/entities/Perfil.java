package com.sgambientes.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "nome")	
	private String nome;
	
	@ManyToOne
	@JoinTable(name= "tb_ambiente_perfil", joinColumns = @JoinColumn(name="perfil_id"), inverseJoinColumns = @JoinColumn(name="ambiente_id"))	
	private Set<Ambiente> ambientes= new HashSet<>();
	
	public Perfil() {
		
	}

	public Perfil(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Ambiente> getCategorias() {
		return ambientes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
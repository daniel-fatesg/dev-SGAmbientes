package com.sgambientes.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "regra")
public class Regra implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	
	private boolean incluir;
	
	
	private boolean excluir;
	
	
	private boolean editar;
	
	
	private boolean listarId;
	
	
	private boolean listarTodos;
	
	public Regra() {
		
	}


	public Regra(Long id, String nome, boolean incluir, boolean excluir, boolean editar, boolean listarId,
			boolean listarTodos) {
		super();
		this.id = id;
		this.nome = nome;
		this.incluir = incluir;
		this.excluir = excluir;
		this.editar = editar;
		this.listarId = listarId;
		this.listarTodos = listarTodos;
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


	public boolean isIncluir() {
		return incluir;
	}


	public void setIncluir(boolean incluir) {
		this.incluir = incluir;
	}


	public boolean isExcluir() {
		return excluir;
	}


	public void setExcluir(boolean excluir) {
		this.excluir = excluir;
	}


	public boolean isEditar() {
		return editar;
	}


	public void setEditar(boolean editar) {
		this.editar = editar;
	}


	public boolean isListarId() {
		return listarId;
	}


	public void setListarId(boolean listarId) {
		this.listarId = listarId;
	}


	public boolean isListarTodos() {
		return listarTodos;
	}


	public void setListarTodos(boolean listarTodos) {
		this.listarTodos = listarTodos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(editar, excluir, id, incluir, listarId, listarTodos, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regra other = (Regra) obj;
		return editar == other.editar && excluir == other.excluir && Objects.equals(id, other.id)
				&& incluir == other.incluir && listarId == other.listarId && listarTodos == other.listarTodos
				&& Objects.equals(nome, other.nome);
	}
	
	


}

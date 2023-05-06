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
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "nome")	
	private String nome;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "celular")	
	private String celular;
	
	@Column(name = "senha")	
	private String senha;
	
	@Column(name = "codrfid")	
	private String codRFID;
	
	@Column(name = "token")	
	private String token;
	
	@Column(name = "status")	
	private boolean status;
	

	public Usuario() {
		
	}
	

	public Usuario(Long id, String nome, String email, String celular, String senha, String codRFID, String token,
			boolean status) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.senha = senha;
		this.codRFID = codRFID;
		this.token = token;
		this.status = status;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodRFID() {
		return codRFID;
	}

	public void setCodRFID(String codRFID) {
		this.codRFID = codRFID;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(celular, codRFID, email, id, nome, senha, status, token);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(codRFID, other.codRFID)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha) && status == other.status
				&& Objects.equals(token, other.token);
	}

	
	
	
	

}

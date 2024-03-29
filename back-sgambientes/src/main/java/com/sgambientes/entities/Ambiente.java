package com.sgambientes.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ambiente")
public class Ambiente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "tipoambiente", nullable=false)
	private int tipoAmbiente;
	
	@Column(name = "numero")	
	private int numero;
	
	@Column(name = "block")	
	private char bloco;
	
	@Column(name = "area")	
	private String area;
	
	@Column(name = "unidlnstitucional")	
	private String unidlnstitucional;
	
	@Column(name = "capacidade")	
	private int capacidade;
	
	@Column(name = "totalPessoa")	
	private int totalPessoa;
	
	@Column(name = "totalComputador")	
	private int totalComputador;
	
	@Column(name = "ipCamera")	
	private String ipCamera;
	
	@JsonIgnore
	@OneToMany(mappedBy = "perfil")	
	private Set<Perfil> perfis = new HashSet<>();
	
	public Ambiente() {
		
	}

	public Ambiente(Long id, int tipoAmbiente, int numero, char bloco, String area, String unidlnstitucional,
			int capacidade, int totalPessoa, int totalComputador, String ipCamera) {
		super();
		this.id = id;
		this.tipoAmbiente = tipoAmbiente;
		this.numero = numero;
		this.bloco = bloco;
		this.area = area;
		this.unidlnstitucional = unidlnstitucional;
		this.capacidade = capacidade;
		this.totalPessoa = totalPessoa;
		this.totalComputador = totalComputador;
		this.ipCamera = ipCamera;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(int tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getBloco() {
		return bloco;
	}

	public void setBloco(char bloco) {
		this.bloco = bloco;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUnidlnstitucional() {
		return unidlnstitucional;
	}

	public void setUnidlnstitucional(String unidlnstitucional) {
		this.unidlnstitucional = unidlnstitucional;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getTotalPessoa() {
		return totalPessoa;
	}

	public void setTotalPessoa(int totalPessoa) {
		this.totalPessoa = totalPessoa;
	}

	public int getTotalComputador() {
		return totalComputador;
	}

	public void setTotalComputador(int totalComputador) {
		this.totalComputador = totalComputador;
	}

	public String getIpCamera() {
		return ipCamera;
	}

	public void setIpCamera(String ipCamera) {
		this.ipCamera = ipCamera;
	}
	
	public Set<Perfil> getPerfil() {
		return perfis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, bloco, capacidade, id, ipCamera, numero, tipoAmbiente, totalComputador, totalPessoa,
				unidlnstitucional);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ambiente other = (Ambiente) obj;
		return Objects.equals(area, other.area) && bloco == other.bloco && capacidade == other.capacidade
				&& Objects.equals(id, other.id) && Objects.equals(ipCamera, other.ipCamera) && numero == other.numero
				&& tipoAmbiente == other.tipoAmbiente && totalComputador == other.totalComputador
				&& totalPessoa == other.totalPessoa && Objects.equals(unidlnstitucional, other.unidlnstitucional);
	}
	
	
	
	

}

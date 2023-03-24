package com.sgambientes.entities;

import java.io.Serializable;

import com.sgambientes.entities.utilities.DateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historicoacesso")
public class HistoricoAcesso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "dataentrada")	
	private DateTime dtEntrada;
	
	@Column(name = "datasaida")	
	private DateTime dtSaida;
	
	public HistoricoAcesso() {
		
	}

	public HistoricoAcesso(Long id, DateTime dtEntrada, DateTime dtSaida) {
		super();
		this.id = id;
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DateTime getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(DateTime dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public DateTime getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(DateTime dtSaida) {
		this.dtSaida = dtSaida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}

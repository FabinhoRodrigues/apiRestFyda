package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipamento_sensorial")
public class EquipamentoSensorial  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7340120933353619354L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="num_serie")
	Long numSerie;
	
	@Column(name="dispositivo")
	String dispositivo;
	
	@Column(name="categoria_equipamento")
	String categoria;
	


	public Long getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(Long numSerie) {
		this.numSerie = numSerie;
	}



	public String getDispositivo() {
		return dispositivo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	
	
	
	
	
}

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
	int numSerie;
	
	@Column(name="dispositivo")
	Dispositivo dispositivo;
	
	@Column(name="categoria_equipamento")
	TipoEquipamento categoria;
	

	

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public TipoEquipamento getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoEquipamento categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}

package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class Pais implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8721145837125791591L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@Column(name="pais")
	String pais;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}

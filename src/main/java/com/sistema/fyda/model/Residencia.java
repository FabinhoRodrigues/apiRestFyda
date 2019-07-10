package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comodo")
public class Residencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5036429179397629694L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@Column(name="numero_comodos")
	int numeroComodo;
	
	@Column(name="usuario")
	String usuario;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getNumeroComodo() {
		return numeroComodo;
	}

	public void setNumeroComodo(int numeroComodo) {
		this.numeroComodo = numeroComodo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	
	

}

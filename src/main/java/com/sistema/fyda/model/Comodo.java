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
public class Comodo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -549721792887188863L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int codigo;
	
	@Column(name="area")
	int area;
	
	@Column(name="categoria")
	TipoComodo categoria;
	
	@Column(name="residencia")
	Residencia residencia;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public TipoComodo getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoComodo categoria) {
		this.categoria = categoria;
	}

	public Residencia getResidencia() {
		return residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
	
	

}

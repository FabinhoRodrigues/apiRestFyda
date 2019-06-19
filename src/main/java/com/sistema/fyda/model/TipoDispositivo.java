package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_dispositivo")
public class TipoDispositivo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8714061100794616091L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int codigo;
	
	@Column(name="descricao") 
	String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

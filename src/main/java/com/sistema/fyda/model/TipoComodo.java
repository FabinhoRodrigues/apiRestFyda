package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_comodo")
public class TipoComodo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3667920904947134879L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@Column(name="descricao") 
	String descricao;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}

package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_equipamento")
public class TipoEquipamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8019899612108245084L;
	
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

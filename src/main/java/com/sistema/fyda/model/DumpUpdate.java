package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dump_update")
public class DumpUpdate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5620148818354879934L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	String log;
	
	String dataInsercao;
	
	String equipamento;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getDataInsercao() {
		return dataInsercao;
	}

	public void setDataInsercao(String dataInsercao) {
		this.dataInsercao = dataInsercao;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	
	

}

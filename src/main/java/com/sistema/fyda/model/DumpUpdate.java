package com.sistema.fyda.model;

import java.io.Serializable;
import java.time.LocalDate;

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
	int codigo;
	
	String log;
	
	LocalDate dataInsercao;
	
	EquipamentoSensorial equipamento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public LocalDate getDataInsercao() {
		return dataInsercao;
	}

	public void setDataInsercao(LocalDate dataInsercao) {
		this.dataInsercao = dataInsercao;
	}

	public EquipamentoSensorial getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(EquipamentoSensorial equipamento) {
		this.equipamento = equipamento;
	}
	
	

}

package com.sistema.fyda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispositivo")
public class Dispositivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9045417646189520071L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long codigo;
	
	@Column(name="consumo")
	int consumo;
	
	@Column(name="estado")
	String estadoConservacao;
	
	@Column(name="potencia")
	int potencia;
	
	@Column(name="data_cadastro")
	String dataCadastro;
	
	@Column(name="categoria")
	String categoria;
	
	@Column(name="comodo")
	String comodo;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getComodo() {
		return comodo;
	}

	public void setComodo(String comodo) {
		this.comodo = comodo;
	}

	
	
}

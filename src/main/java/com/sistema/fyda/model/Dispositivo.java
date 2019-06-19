package com.sistema.fyda.model;

import java.io.Serializable;
import java.time.LocalDate;

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
	int codigo;
	
	@Column(name="consumo")
	int consumo;
	
	@Column(name="estado")
	String estadoConservacao;
	
	@Column(name="potencia")
	int potencia;
	
	@Column(name="data_cadastro")
	LocalDate dataCadastro;
	
	@Column(name="categoria")
	TipoDispositivo categoria;
	
	@Column(name="comodo")
	TipoComodo comodo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public TipoDispositivo getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoDispositivo categoria) {
		this.categoria = categoria;
	}

	public TipoComodo getComodo() {
		return comodo;
	}

	public void setComodo(TipoComodo comodo) {
		this.comodo = comodo;
	}
	
	
	
}

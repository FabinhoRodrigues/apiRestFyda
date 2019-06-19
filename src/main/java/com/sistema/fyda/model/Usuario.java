package com.sistema.fyda.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -262459416354353340L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int codigo;
	
	@Column(name="data_cadastro") 
	LocalDate dataCadastro;
	
	@Column(name="senha") 
	String senha;
	
	@Column(name="email") 
	String email;
	
	@Column(name="token") 
	String token;
	
	@ManyToOne
	@JoinColumn(name="cpf") 
	Pessoa cpf;
	
	@Column(name="cod_usuario") 
	TipoUsuario codUsuario;


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Pessoa getCpf() {
		return cpf;
	}

	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public TipoUsuario getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(TipoUsuario codUsuario) {
		this.codUsuario = codUsuario;
	}

	

	
	

}

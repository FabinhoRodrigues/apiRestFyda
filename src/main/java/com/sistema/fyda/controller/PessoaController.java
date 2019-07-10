package com.sistema.fyda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.fyda.model.Pessoa;
import com.sistema.fyda.repository.PessoaRepository;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api("Api Rest Pessoa")
@CrossOrigin(origins = "*")
public class PessoaController {

	@Autowired
	PessoaRepository repository;
	
	@GetMapping("/pessoas")
	@ApiOperation(value="Retorna uma lista de pessoas")
	public List<Pessoa> findAllByPessoas(){
		return repository.findAll();
		
	} 
	
    @GetMapping("/pessoa/{id}")
	@ApiOperation(value="Retorna uma pessoa") 
	public Optional<Pessoa> findByPessoa(@PathVariable(value="id") long id){
		return repository.findById(id);
	  
	}
}

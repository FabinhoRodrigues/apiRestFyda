package com.sistema.fyda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.fyda.model.Cidade;
import com.sistema.fyda.repository.CidadeRepository;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api("Api Rest Cidade")
@CrossOrigin(origins="*")
public class CidadeConroller {
	
	@Autowired
	CidadeRepository cidadeRepository;
	
	@GetMapping("/cidades")
	@ApiOperation(value="Retorna uma lista de cidades")
	public List<Cidade> findAllByCidades(){
		return cidadeRepository.findAll();
		
	} 
	
    @GetMapping("/cidade/{id}")
	@ApiOperation(value="Retorna uma cidade") 
	public Optional<Cidade> findByCidade(@PathVariable(value="id") long id){
		return cidadeRepository.findById(id);
	  
	}

}

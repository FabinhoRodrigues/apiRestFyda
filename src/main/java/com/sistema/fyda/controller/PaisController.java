package com.sistema.fyda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.fyda.model.Pais;
import com.sistema.fyda.repository.PaisRepository;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api("Api Rest Pais")
@CrossOrigin(origins="*")
public class PaisController {
	
	@Autowired
	PaisRepository paisRepository;
	
	@GetMapping("/paises")
	@ApiOperation(value="Retorna uma lista de países")
	public List<Pais> findAllByPaises(){
		return paisRepository.findAll();
		
	} 
	
    @GetMapping("/pais/{id}")
	@ApiOperation(value="Retorna um país") 
	public Optional<Pais> findByPais(@PathVariable(value="id") long id){
		return paisRepository.findById(id);
	  
	}
	 
}

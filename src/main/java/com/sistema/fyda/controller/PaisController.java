package com.sistema.fyda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/pais")
	@ApiOperation(value="Retorna uma lista de países")
	public List<Pais> findAllByUsuarios(){
		return paisRepository.findAll();
		
	} 

}

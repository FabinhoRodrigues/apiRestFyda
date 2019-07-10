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
import com.sistema.fyda.model.Usuario;
import com.sistema.fyda.repository.PessoaRepository;
import com.sistema.fyda.repository.UsuarioRepository;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api("Api Rest Usuario")
@CrossOrigin(origins="*")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/usuarios")
	@ApiOperation(value="Retorna uma lista de usuarios")
	public List<Usuario> findAllByUsuarios(){
		return repository.findAll();
		
	} 
	
    @GetMapping("/usuario/{id}")
	@ApiOperation(value="Retorna um usuario") 
	public Optional<Usuario> findByUsuario(@PathVariable(value="id") long id){
		return repository.findById(id);
	  
	}
	
	
	
}

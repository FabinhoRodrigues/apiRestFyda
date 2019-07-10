package com.sistema.fyda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.fyda.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

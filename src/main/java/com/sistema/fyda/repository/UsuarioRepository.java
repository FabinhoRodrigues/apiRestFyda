package com.sistema.fyda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.fyda.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

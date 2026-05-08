package com.baggio.api.prestacao_contas.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baggio.api.prestacao_contas.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  Optional<Usuario> findByEmail(String email);
  
}

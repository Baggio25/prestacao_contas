package com.baggio.api.prestacao_contas.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioRequestDTO;
import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioResponseDTO;
import com.baggio.api.prestacao_contas.entities.Usuario;
import com.baggio.api.prestacao_contas.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
  
  private final UsuarioRepository repository;
  private final ModelMapper mapper;
  private final PasswordEncoder passwordEncoder;

  @Transactional
  public UsuarioResponseDTO criar(UsuarioRequestDTO dto) {
    Usuario usuario = mapper.map(dto, Usuario.class);
    usuario.setSenha(passwordEncoder.encode(dto.senha()));
    usuario.setAtivo(true);

    repository.save(usuario);
    
    return mapper.map(usuario, UsuarioResponseDTO.class);
  }

}

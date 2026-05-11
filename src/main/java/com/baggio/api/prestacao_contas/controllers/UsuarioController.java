package com.baggio.api.prestacao_contas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.baggio.api.prestacao_contas.config.constants.RoutesConstants;
import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioRequestDTO;
import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioResponseDTO;
import com.baggio.api.prestacao_contas.services.UsuarioService;

import lombok.RequiredArgsConstructor;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(RoutesConstants.USUARIOS)
@RequiredArgsConstructor
public class UsuarioController {
  
  private final UsuarioService service;

  

  @PostMapping
  public ResponseEntity<UsuarioResponseDTO> criar(@RequestBody UsuarioRequestDTO dto) {
    UsuarioResponseDTO resDto = service.criar(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(resDto.id()).toUri();
    
    return ResponseEntity.created(uri).body(resDto);
  }
  
}

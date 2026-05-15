package com.baggio.api.prestacao_contas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.baggio.api.prestacao_contas.config.constants.RoutesConstants;
import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioRequestDTO;
import com.baggio.api.prestacao_contas.dtos.usuario.UsuarioResponseDTO;
import com.baggio.api.prestacao_contas.services.UsuarioService;

import lombok.RequiredArgsConstructor;

import java.net.URI;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(RoutesConstants.USUARIOS)
@RequiredArgsConstructor
public class UsuarioController {
  
  private final UsuarioService service;

  @GetMapping(value = RoutesConstants.ID_URL_PARAM)
  public ResponseEntity<UsuarioResponseDTO> buscaPorId(@PathVariable Long id) {
    return null;
  }

  @GetMapping
  public ResponseEntity<Page<UsuarioResponseDTO>> buscaPaginada(Pageable pageable) {
    return null;
  }

  @PostMapping
  public ResponseEntity<UsuarioResponseDTO> criar(@RequestBody UsuarioRequestDTO dto) {
    UsuarioResponseDTO resDto = service.criar(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(resDto.id()).toUri();
    
    return ResponseEntity.created(uri).body(resDto);
  }
  
}

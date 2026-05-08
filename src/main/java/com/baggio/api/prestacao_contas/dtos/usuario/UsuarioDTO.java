package com.baggio.api.prestacao_contas.dtos.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(
  Long id,  

  @NotBlank(message = "O [nome] é obrigatório")
  @Min(value = 3, message = "O [nome] deve conter ao menos 3 caracteres")
  String nome,

  @NotBlank(message = "O [email] é obrigatório")
  @Email(message = "O [email] é inválido")
  String email,
  
  @NotBlank(message = "O [perfil] é obrigatório")
  String perfil,

  Boolean ativo
) {}

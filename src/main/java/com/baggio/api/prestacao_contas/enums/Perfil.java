package com.baggio.api.prestacao_contas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Perfil {
  ADMIN("Administrador"), 
  OPERADOR("Operador"),
  CONSULTA("Consulta");

  private final String descricao;
}

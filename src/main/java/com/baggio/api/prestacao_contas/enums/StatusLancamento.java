package com.baggio.api.prestacao_contas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusLancamento {
  PENDENTE("Pendente"),
  BAIXADA("Baixada");

  private final String descricao;

  public boolean isBaixado() {
    return this == BAIXADA;
  }
}

package com.baggio.api.prestacao_contas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoCategoria {
  RECEITA("Receita"),
  DESPESA("Despesa");

  private final String descricao;
}

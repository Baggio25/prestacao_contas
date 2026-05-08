package com.baggio.api.prestacao_contas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoConta {
  BANCARIA("Bancária"),
  CAIXA("Caixa");

  private final String descricao;
}

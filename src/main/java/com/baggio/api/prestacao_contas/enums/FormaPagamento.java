package com.baggio.api.prestacao_contas.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FormaPagamento {
  DINHEIRO("Dinheiro"),
  PIX("Pix"),
  CARTAO("Cartão"),
  BOLETO("Boleto");

  private final String descricao;
}

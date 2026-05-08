package com.baggio.api.prestacao_contas.enums;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TipoLancamento {
  RECEITA("Receita") {
    @Override
    public BigDecimal aplicar(BigDecimal saldo, BigDecimal valor) {
      return saldo.add(valor);     
    }
  },
  DESPESA("Despesa") {
    @Override
    public BigDecimal aplicar(BigDecimal saldo, BigDecimal valor) {
      return saldo.subtract(valor);
    }
  };

  private final String descricao;
  public abstract BigDecimal aplicar(BigDecimal saldo, BigDecimal valor);
}

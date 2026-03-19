package folha_pagamento;

public interface Imposto_interface {
	double calcular(double valorBase);
    String getNome();
    String getAno();
}

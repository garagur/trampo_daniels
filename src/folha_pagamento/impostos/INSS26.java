package folha_pagamento.impostos;

import folha_pagamento.Imposto_interface;

public class INSS26 implements Imposto_interface {
	@Override
    public double calcular(double valorBase) {
        if (valorBase <= 1500) return valorBase * 0.075;
        return valorBase * 0.09;
    }

    @Override
    public String getNome() {
        return "INSS";
    }
    public String getAno() {
        return "2026";
    }
}

package folha_pagamento.impostos;

import folha_pagamento.Imposto_interface;

public class INSS25 implements Imposto_interface {
	@Override
    public double calcular(double valorBase) {
        if (valorBase <= 3500) return valorBase * 0.075;
        return valorBase * 0.1;
    }

    @Override
    public String getNome() {
        return "INSS";
    }
    public String getAno() {
        return "2026";
    }
}

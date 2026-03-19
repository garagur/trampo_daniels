package folha_pagamento.impostos;

import folha_pagamento.Imposto_interface;

public class ISS25 implements Imposto_interface {
	@Override
    public double calcular(double valorBase) {
        return valorBase * 0.09;
    }

    @Override
    public String getNome() {
        return "ISS";
    }
    public String getAno() {
        return "2025";
    }
}

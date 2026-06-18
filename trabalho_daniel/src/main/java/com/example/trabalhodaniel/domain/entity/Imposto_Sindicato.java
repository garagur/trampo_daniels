package com.example.trabalhodaniel.domain.entity;

import com.example.trabalhodaniel.domain.repository.Imposto;

public class Imposto_Sindicato implements Imposto {

    private static final double VALOR_DESCONTO = 100.0;

    @Override
    public double calcularValorImposto() {
        return VALOR_DESCONTO;
    }

    @Override
    public String getNomeImposto() {
        return "Sindicato";
    }
}

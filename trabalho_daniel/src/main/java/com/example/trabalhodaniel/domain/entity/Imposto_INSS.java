package com.example.trabalhodaniel.domain.entity;

import com.example.trabalhodaniel.domain.repository.Imposto;

public class Imposto_INSS implements Imposto {

    private final double salarioBase;

    public Imposto_INSS(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularValorImposto() {
        return this.salarioBase * 0.11;
    }

    @Override
    public String getNomeImposto() {
        return "INSS";
    }
}
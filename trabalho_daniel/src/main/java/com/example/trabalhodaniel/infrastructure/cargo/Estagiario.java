package com.example.trabalhodaniel.infrastructure.cargo;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.domain.repository.Imposto;
import org.springframework.stereotype.Component;

@Component
public class Estagiario implements Interface_Cargos {

    private static final double SALARIO_BASE = 1500.0;
    private static final int HORAS_EXIGIDAS = 120;

    private final Imposto[] impostos;

    public Estagiario(Imposto[] impostos) {
        this.impostos = impostos;
    }

    @Override
    public String NomeCargo() {
        return "Estagiário";
    }

    @Override
    public double SalarioBase() {
        return SALARIO_BASE;
    }

    @Override
    public int HorasExigidas() {
        return HORAS_EXIGIDAS;
    }

    @Override
    public Imposto[] getImpostos() {
        return impostos;
    }
}

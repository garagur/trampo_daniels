package com.example.trabalhodaniel.infrastructure.cargo;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.domain.repository.Imposto;
import org.springframework.stereotype.Component;

@Component
public class DevJunior implements Interface_Cargos {

    private static final double SALARIO_BASE = 4000.0;
    private static final int HORAS_EXIGIDAS = 160;

    private final Imposto[] impostos;

    public DevJunior(Imposto[] impostos) {
        this.impostos = impostos;
    }

    @Override
    public String NomeCargo() {
        return "Desenvolvedor Junior";
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

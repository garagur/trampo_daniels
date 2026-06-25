package com.example.trabalhodaniel.infrastructure.cargo;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.domain.repository.Imposto;
import org.springframework.stereotype.Component;

public class DevSenior implements Interface_Cargos {

    private static final double SALARIO_BASE = 8000.0;
    private static final int HORAS_EXIGIDAS = 160;
    private final Imposto[] impostos;

    public DevSenior(Imposto[] impostos) {
        this.impostos = impostos;
    }

    @Override
    public String NomeCargo() {
        return "Desenvolvedor Senior";
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

    @Component
    public static class Registrar {
        public Registrar(CargoFactory factory) {
            factory.registrar("DevSenior", impostos -> new DevSenior(impostos));
        }
    }
}
package com.example.trabalhodaniel.service;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import org.springframework.stereotype.Component;

@Component
public class Calculo_horas {

    public double calcularSalarioLiquido(
            Interface_Cargos cargo,
            int horasExtras,
            int horasDesconto) {

        double salarioBase = cargo.SalarioBase();
        double valorAcrescimo = calcularAcrescimo(cargo, horasExtras);
        double valorDesconto = calcularDesconto(cargo, horasDesconto);

        return (salarioBase + valorAcrescimo) - valorDesconto;
    }

    private double calcularAcrescimo(Interface_Cargos cargo, int horasExtras) {
        if (cargo.NomeCargo().equalsIgnoreCase("Estagiário")) {
            return 0.0;
        }

        double valorHora = cargo.SalarioBase() / cargo.HorasExigidas();
        return valorHora * horasExtras;
    }

    private double calcularDesconto(Interface_Cargos cargo, int horasDesconto) {
        double valorHora = cargo.SalarioBase() / cargo.HorasExigidas();
        return valorHora * horasDesconto;
    }
}

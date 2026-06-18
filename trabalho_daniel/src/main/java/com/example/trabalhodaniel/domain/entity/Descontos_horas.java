package com.example.trabalhodaniel.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public class Descontos_horas {
    public int horasDesconto;

    public Descontos_horas(int horasDesconto) {
        this.horasDesconto = horasDesconto;
    }
}

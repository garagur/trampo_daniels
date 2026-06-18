package com.example.trabalhodaniel.domain.entity;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String nomeCargoSalvo;

    @Transient
    private Interface_Cargos cargo;

    private int horasExtras;
    private int horasDesconto;

    public Funcionario(String nome, Interface_Cargos cargo, int horasExtras, int horasDesconto) {
        this.nome = nome;
        this.cargo = cargo;
        if (cargo != null) {
            this.nomeCargoSalvo = cargo.NomeCargo();
        }
        this.horasExtras = horasExtras;
        this.horasDesconto = horasDesconto;
    }
}
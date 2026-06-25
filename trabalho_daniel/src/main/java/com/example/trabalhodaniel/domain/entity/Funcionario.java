package com.example.trabalhodaniel.domain.entity;

import com.example.trabalhodaniel.domain.repository.Interface_Cargos;

public class Funcionario {
    private Long id;
    private String nome;
    private String nomeCargoSalvo;
    private Interface_Cargos cargo;
    private int horasExtras;
    private int horasDesconto;

    public Funcionario(Long id, String nome, Interface_Cargos cargo, int horasExtras, int horasDesconto) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        if (cargo != null) {
            this.nomeCargoSalvo = cargo.NomeCargo();
        }
        this.horasExtras = horasExtras;
        this.horasDesconto = horasDesconto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCargoSalvo() {
        return nomeCargoSalvo;
    }

    public Interface_Cargos getCargo() {
        return cargo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public int getHorasDesconto() {
        return horasDesconto;
    }
}
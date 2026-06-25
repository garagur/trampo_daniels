package com.example.trabalhodaniel.domain.entity;

import java.time.LocalDateTime;

public class ReciboPagamento {

    private Long id;
    private Funcionario funcionario;
    private double salarioBase;
    private double totalImpostos;
    private double salarioLiquido;
    private LocalDateTime dataEmissao;

    public ReciboPagamento(Funcionario funcionario, double salarioBase,
            double totalImpostos, double salarioLiquido) {
        this.funcionario = funcionario;
        this.salarioBase = salarioBase;
        this.totalImpostos = totalImpostos;
        this.salarioLiquido = salarioLiquido;
        this.dataEmissao = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }
}
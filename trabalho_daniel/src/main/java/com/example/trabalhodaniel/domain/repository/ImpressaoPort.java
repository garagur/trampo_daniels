package com.example.trabalhodaniel.domain.repository;

import com.example.trabalhodaniel.domain.entity.Funcionario;

public interface ImpressaoPort {

    void imprimir(Funcionario funcionario, double salarioBase, double totalImpostos, double salarioLiquido);
}

package com.example.trabalhodaniel.domain.repository;

public interface Interface_Cargos {
    String NomeCargo();

    double SalarioBase();

    int HorasExigidas();

    Imposto[] getImpostos();
}

package trabalho.domain.entities;

import trabalho.domain.repositories.interface_Horas_declaracao;

public class Funcionario_construtor implements interface_Horas_declaracao {
    private String nome;
    private Cargo_Construtor_abstrato cargo;
    private double horasExtras;
    private double horasDescontadas;

    public Funcionario_construtor(String nome, double horasExtras, double horasDescontadas) {
        this.nome = nome;
        this.horasExtras = horasExtras;
        this.horasDescontadas = horasDescontadas;
    }

    public void setCargo(Cargo_Construtor_abstrato cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Cargo_Construtor_abstrato getCargo() {
        return cargo;
    }

    @Override
    public double getHoras_extras() {
        return horasExtras;
    }

    @Override
    public double getHoras_descontadas() {
        return horasDescontadas;
    }
}

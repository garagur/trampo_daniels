package trabalho_daniel.domain.entities;

import trabalho_daniel.domain.repositories.Interface_Cargos;

public class Funcionario {

    private final String nome;
    private final Interface_Cargos cargo;
    private final int horasExtras;
    private final int horasDesconto;

    public Funcionario(String nome, Interface_Cargos cargo, int horasExtras, int horasDesconto) {
        this.nome = nome;
        this.cargo = cargo;
        this.horasExtras = horasExtras;
        this.horasDesconto = horasDesconto;
    }

    public String getNome() {
        return nome;
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
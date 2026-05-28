package trabalho_daniel.application.usecases;

import trabalho_daniel.domain.entities.Cargo_Construtor_abstrato;
import trabalho_daniel.domain.entities.Cargo_holerite;
import trabalho_daniel.domain.entities.Funcionario_construtor;
import trabalho_daniel.domain.repositories.interface_impressao;

public class processador_pagamento {

    private final Cargo_calculo calculadora;
    private final interface_impressao impressora;

    public processador_pagamento(Cargo_calculo calculadora, interface_impressao impressora) {
        this.calculadora = calculadora;
        this.impressora = impressora;
    }

    public void executar(Funcionario_construtor funcionario) {

        Cargo_Construtor_abstrato cargo = funcionario.getCargo();

        Cargo_holerite holerite = calculadora.calcular(cargo);

        impressora.imprimir(funcionario, holerite);
    }
}
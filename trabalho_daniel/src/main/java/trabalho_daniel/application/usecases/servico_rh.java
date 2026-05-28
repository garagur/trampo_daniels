package trabalho_daniel.application.usecases;

import trabalho_daniel.domain.entities.Funcionario_construtor;

public class servico_rh {
    private final processador_pagamento processador;

    public servico_rh(processador_pagamento processador) {
        this.processador = processador;
    }

    public void processarFolha(Funcionario_construtor funcionario) {
        processador.executar(funcionario);
    }
}

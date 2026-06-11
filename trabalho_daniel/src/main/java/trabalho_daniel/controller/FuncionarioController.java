package trabalho_daniel.controller;

import trabalho_daniel.domain.entities.Funcionario;
import trabalho_daniel.domain.repositories.CargoFactoryPort;
import trabalho_daniel.domain.repositories.Imposto;
import trabalho_daniel.domain.repositories.Interface_Cargos;
import trabalho_daniel.use_cases.ServicoRH;

public class FuncionarioController {

    private final ServicoRH servicoRH;
    private final CargoFactoryPort cargoFactory;

    // recebe CargoFactoryPort — não sabe que existe CargoFactory de infrastructure
    public FuncionarioController(ServicoRH servicoRH, CargoFactoryPort cargoFactory) {
        this.servicoRH = servicoRH;
        this.cargoFactory = cargoFactory;
    }

    public void processarFuncionario(
            String nome,
            String nomeCargo,
            Imposto[] impostos,
            int horasExtras,
            int horasDesconto) {

        Interface_Cargos cargo = cargoFactory.criar(nomeCargo, impostos);

        Funcionario funcionario = new Funcionario(nome, cargo, horasExtras, horasDesconto);

        servicoRH.processarFolha(funcionario);
    }
}
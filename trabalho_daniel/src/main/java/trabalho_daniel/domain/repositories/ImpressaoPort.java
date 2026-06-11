package trabalho_daniel.domain.repositories;

import trabalho_daniel.domain.entities.Funcionario;

public interface ImpressaoPort {

    void imprimir(Funcionario funcionario, double salarioBase, double totalImpostos, double salarioLiquido);
}
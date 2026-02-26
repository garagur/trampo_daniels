package folha_pagamento;
import java.util.List;

public interface pagamento {
    double calcularLiquido(Funcionarios funcionario, Cargo cargo, List<Imposto> impostos);
}
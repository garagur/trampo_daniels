package folha_pagamento;
import java.util.List;

public interface interface_pagamentos {
    double calcularLiquido(Funcionarios funcionario, Cargo cargo, List<Imposto> impostos, Horas horas);
}
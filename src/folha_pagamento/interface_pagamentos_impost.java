package folha_pagamento;
import java.util.List;

public interface interface_pagamentos_impost {
    double calcularLiquido_imposto(Funcionarios funcionario, List<Imposto_interface> impostos);
}
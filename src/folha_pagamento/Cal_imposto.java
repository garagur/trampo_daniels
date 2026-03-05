package folha_pagamento;

import java.util.List;

public class Cal_imposto implements interface_pagamentos {

    @Override
    public double calcularLiquido(Funcionarios funcionario, Cargo cargo, List<Imposto> impostos, Horas horas) {
        double salarioBase = cargo.getSalario_bru();



        double totalDescontos = 0;
        for (Imposto imp : impostos) {
            if (imp.getValor() < 1) {
                totalDescontos += salarioBase * imp.getValor();
            } else {
                totalDescontos += imp.getValor();
            }
        }

        return totalDescontos;
    }
}

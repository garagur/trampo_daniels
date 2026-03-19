package folha_pagamento;

import folha_pagamento.impostos.INSS26;
import folha_pagamento.impostos.INSS25;

public class insert_dados{

    public void executar() {
        interface_pagamentos_horas motorHoras = new Cal_horas();
        Cal_imposto motorImposto = new Cal_imposto();

        ImprimirFolha impressora = new ImprimirFolha();


        Funcionarios mateus = new Funcionarios("Mateus", "Rua X", "123", "Bradesco","Senior", 1300);
        Horas horasMateus = new Horas(10, 2);
        mateus.adicionarImposto(new INSS25());
        
        double brutoFinal = motorHoras.calcularLiquido_horas(mateus, horasMateus);

        double totalDescontos = motorImposto.calcularLiquido_imposto(mateus, mateus.getImpostosDoCargo());

        double liquidoFinal = brutoFinal - totalDescontos;

        impressora.gerarHolerite(mateus, brutoFinal, totalDescontos, liquidoFinal, mateus.getImpostosDoCargo(), "12/02/2025");
    }
}
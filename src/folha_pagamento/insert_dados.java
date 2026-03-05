package folha_pagamento;

public class insert_dados {

    public void executar() {
    	String dataFolha = "Março/2026";
        interface_pagamentos motorHoras = new Cal_horas();
        interface_pagamentos motorImposto = new Cal_imposto();
        

        ImprimirFolha impressora = new ImprimirFolha();


        Imposto inss = new Imposto("INSS", 0.11); 
        Imposto fgts = new Imposto("FGTS", 0.08); 

        Cargo senior = new Cargo("Senior", 2000);
        senior.adicionarImposto(inss);
        senior.adicionarImposto(fgts);

        Funcionarios mateus = new Funcionarios("Mateus", "Rua X", "123", "Bradesco");
        Horas horasMateus = new Horas(10, 2);


        double brutoFinal = motorHoras.calcularLiquido(
            mateus, senior, senior.getImpostosDoCargo(), horasMateus
        );

        double totalDescontos = motorImposto.calcularLiquido(
            mateus, senior, senior.getImpostosDoCargo(), horasMateus
        );

        double liquidoFinal = brutoFinal - totalDescontos;

        impressora.gerarHolerite(mateus, senior, brutoFinal, totalDescontos, liquidoFinal, dataFolha);
    }
}
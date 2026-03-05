package folha_pagamento;

public class ImprimirFolha {

    public void gerarHolerite(Funcionarios func, Cargo cargo, double bruto, double impostos, double liquido, String dataReferencia) {
        System.out.println("========================================");
        System.out.println("           HOLERITE DE PAGAMENTO        ");
        System.out.println("           Mês/Ano: " + dataReferencia);
        System.out.println("========================================");
        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Cargo:       " + cargo.getTitulo());
        System.out.println("----------------------------------------");
        System.out.printf("Salário Base:    R$ %.2f\n", cargo.getSalario_bru());
        System.out.printf("Salário Bruto:   R$ %.2f (com horas)\n", bruto);
        System.out.printf("Total Descontos: R$ %.2f\n", impostos);
        System.out.println("----------------------------------------");
        System.out.printf("LÍQUIDO FINAL:   R$ %.2f\n", liquido);
        System.out.println("========================================\n");
    }
}
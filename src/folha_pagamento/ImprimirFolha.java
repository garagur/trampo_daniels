package folha_pagamento;
import java.util.List;

public class ImprimirFolha {

    public void gerarHolerite(Funcionarios func, double bruto, double impostos, double liquido, List<Imposto_interface> Impostos, String dataReferencia) {
        System.out.println("========================================");
        System.out.println("           HOLERITE DE PAGAMENTO        ");
        System.out.println("           Mês/Ano: " + dataReferencia);
        System.out.println("========================================");
        System.out.println("Funcionário: " + func.getNome());
        System.out.println("Cargo:       " + func.getTitulo());
        System.out.println("----------------------------------------");
        System.out.printf("Salário Base:    R$ %.2f\n", func.getSalario_bru());
        System.out.printf("Salário Bruto:   R$ %.2f (com horas)\n", bruto);
        System.out.println("----------------------------------------");
        System.out.println("DETALHAMENTO DE IMPOSTOS");
        for (Imposto_interface imp : Impostos) {
            double valorCalculado = imp.calcular(func.getSalario_bru());
            System.out.printf("%-15s [%s]: R$ %.2f\n", 
                imp.getNome(), 
                imp.getAno(), 
                valorCalculado);
        System.out.println("----------------------------------------");
        System.out.printf("LÍQUIDO FINAL:   R$ %.2f\n", liquido);
        System.out.println("========================================\n");
    }
}
    }
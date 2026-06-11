package trabalho_daniel.infraesturure.output;

import trabalho_daniel.domain.entities.Funcionario;
import trabalho_daniel.domain.repositories.ImpressaoPort;

public class ImpressaoConsole implements ImpressaoPort {

    @Override
    public void imprimir(
            Funcionario funcionario,
            double salarioBase,
            double totalImpostos,
            double salarioLiquido) {

        System.out.println("========================================");
        System.out.println("         RECIBO DE PAGAMENTO            ");
        System.out.println("========================================");
        System.out.println("Funcionário : " + funcionario.getNome());
        System.out.println("Cargo       : " + funcionario.getCargo().NomeCargo());
        System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
        System.out.println("----------------------------------------");
        System.out.printf("Descontos   : R$ %.2f%n", totalImpostos);
        System.out.println("========================================");
        System.out.printf("LÍQUIDO     : R$ %.2f%n", salarioLiquido);
        System.out.println("========================================");
    }
}
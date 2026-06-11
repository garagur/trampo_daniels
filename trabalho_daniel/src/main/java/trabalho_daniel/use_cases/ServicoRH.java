package trabalho_daniel.use_cases;

import trabalho_daniel.domain.entities.Funcionario;
import trabalho_daniel.domain.repositories.ImpressaoPort;

public class ServicoRH {

    private final Calculo_Descontos calculoDescontos;
    private final Calculo_horas calculoHoras;
    private final ImpressaoPort impressao;

    public ServicoRH(
            Calculo_Descontos calculoDescontos,
            Calculo_horas calculoHoras,
            ImpressaoPort impressao) {
        this.calculoDescontos = calculoDescontos;
        this.calculoHoras = calculoHoras;
        this.impressao = impressao;
    }

    public void processarFolha(Funcionario funcionario) {

        double salarioBase = funcionario.getCargo().SalarioBase();

        double totalImpostos = calculoDescontos.calcularImpostos(
                funcionario.getCargo(),
                funcionario.getCargo().getImpostos());

        double ajusteHoras = calculoHoras.calcularSalarioLiquido(
                funcionario.getCargo(),
                funcionario.getHorasExtras(),
                funcionario.getHorasDesconto());

        double salarioLiquido = ajusteHoras - totalImpostos;

        impressao.imprimir(funcionario, salarioBase, totalImpostos, salarioLiquido);
    }
}
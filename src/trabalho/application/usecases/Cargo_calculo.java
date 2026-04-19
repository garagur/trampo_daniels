package trabalho.application.usecases;

import trabalho.domain.entities.Cargo_Construtor_abstrato;
import trabalho.domain.entities.Cargo_holerite;
import trabalho.domain.repositories.interface_descontos;
import trabalho.domain.repositories.interface_acrecimos;

import java.util.ArrayList;
import java.util.List;

public class Cargo_calculo {

    public Cargo_holerite calcular(Cargo_Construtor_abstrato cargo) {
        double totalDescontos = 0;
        double totalAcrecimos = 0;
        double salarioBase = cargo.getSalarioBruto();

        List<String> extratoDescontos = new ArrayList<>();
        List<String> extratoAcrecimos = new ArrayList<>();

        for (interface_descontos d : cargo.getDescontos()) {
            double valor = d.calcular(salarioBase);
            totalDescontos += valor;
            extratoDescontos.add(d.getNome() + ": R$ " + valor);
        }

        for (interface_acrecimos a : cargo.getAcrecimos()) {
            double valor = a.calcular(salarioBase);
            totalAcrecimos += valor;
            extratoAcrecimos.add(a.getNome() + ": R$ " + valor);
        }

        double salarioLiquido = (salarioBase - totalDescontos) + totalAcrecimos;

        return new Cargo_holerite(salarioLiquido, extratoDescontos, extratoAcrecimos);
    }
}
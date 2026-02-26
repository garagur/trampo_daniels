package folha_pagamento;
import java.util.List;


public class Pagamentos implements pagamento {
@Override
public double calcularLiquido(Funcionarios funcionario, Cargo cargo, List<Imposto> impostos) {
    double salarioBase = cargo.getSalario_bru();
    double jornadaMinimaDoCargo = cargo.getJornada_min(); 
    double horasTrabalhadas = funcionario.getJornadaTraba();
    
    double valorHora = salarioBase / jornadaMinimaDoCargo;
    double salarioBrutoFinal;

    if (horasTrabalhadas > jornadaMinimaDoCargo) {
        if (cargo.getTitulo().equalsIgnoreCase("Estagiario")) {
            salarioBrutoFinal = salarioBase;
        } else {
            double horasExtras = horasTrabalhadas - jornadaMinimaDoCargo;
            double valorBonus = horasExtras * valorHora;
            double limiteMaximoBonus = salarioBase * 0.30;


            if (valorBonus > limiteMaximoBonus) {
                valorBonus = limiteMaximoBonus;
            }
            salarioBrutoFinal = salarioBase + valorBonus;
        }
    } else {

        salarioBrutoFinal = valorHora * horasTrabalhadas;
    }

    double totalDescontos = 0;
    for (Imposto imp : impostos) {
        if (imp.getValor() < 1) {
            totalDescontos += salarioBrutoFinal * imp.getValor();
        } else {
            totalDescontos += imp.getValor();
        }
    }

    return salarioBrutoFinal - totalDescontos;
}
}
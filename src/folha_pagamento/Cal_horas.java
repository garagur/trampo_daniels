	package folha_pagamento;
	
	import java.util.List;
	
	public class Cal_horas implements interface_pagamentos {
	
	    @Override
	    public double calcularLiquido(Funcionarios funcionario, Cargo cargo, List<Imposto> impostos, Horas horas) {
	        double salarioBase = cargo.getSalario_bru();
	        double horasExtra = horas.getHoras_ex();
	        double horasDesc = horas.getHoras_faltadas();
	        double valorHora = salarioBase * 0.01;
	        double salarioBrutoFinal;
	
	        if (horasExtra > horasDesc) {
	            double saldoExtra = horasExtra - horasDesc;
	
	            if (cargo.getTitulo().equalsIgnoreCase("Estagiario")) {
	                salarioBrutoFinal = salarioBase;
	            } else {
	                double valorBonus = saldoExtra * valorHora;
	                double limiteMaximoBonus = salarioBase * 0.30;
	
	                if (valorBonus > limiteMaximoBonus) {
	                    valorBonus = limiteMaximoBonus;
	                }
	                salarioBrutoFinal = salarioBase + valorBonus;
	            }
	        } else {
	            double saldoFaltas;
	            if (cargo.getTitulo().equalsIgnoreCase("Estagiario")) {
	                saldoFaltas = horasDesc;
	            } else {
	                saldoFaltas = horasDesc - horasExtra;
	            }
	            salarioBrutoFinal = salarioBase - (saldoFaltas * valorHora);
	        }
	
	
	        return salarioBrutoFinal;
	    }
	}
	package folha_pagamento;
	
	
	public class Cal_horas implements interface_pagamentos_horas {
	
	    @Override
	    public double calcularLiquido_horas(Funcionarios funcionario, Horas horas) {
	        double salarioBase = funcionario.getSalario_bru();
	        double horasExtra = horas.getHoras_ex();
	        double horasDesc = horas.getHoras_faltadas();
	        double valorHora = salarioBase * 0.01;
	        double salarioBrutoFinal;
	
	        if (horasExtra > horasDesc) {
	            double saldoExtra = horasExtra - horasDesc;
	
	            if (funcionario.getTitulo().equalsIgnoreCase("Estagiario")) {
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
	            if (funcionario.getTitulo().equalsIgnoreCase("Estagiario")) {
	                saldoFaltas = horasDesc;
	            } else {
	                saldoFaltas = horasDesc - horasExtra;
	            }
	            salarioBrutoFinal = salarioBase - (saldoFaltas * valorHora);
	        }
	
	
	        return salarioBrutoFinal;
	    }
	}
	package folha_pagamento;
	
	import java.util.List;
	
	public class Cal_imposto implements interface_pagamentos_impost {


	    public double calcularLiquido_imposto(Funcionarios funcionario, List<Imposto_interface> impostos) {
	        double salarioBase = funcionario.getSalario_bru();
	        double totalDescontos = 0;

	        for (Imposto_interface imp : impostos) {
	            totalDescontos += imp.calcular(salarioBase);
	        }

	        return totalDescontos;
	    }
	}

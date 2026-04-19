package trabalho;

import trabalho.application.usecases.Cargo_calculo;
import trabalho.application.usecases.impressao;
import trabalho.application.usecases.processador_pagamento;
import trabalho.application.usecases.servico_rh;
import trabalho.domain.repositories.interface_impressao;
import trabalho.infrestructure.adapter.Funcionario_inserir_dados;

public class Principal {
	public static void main(String[] args) {

		Cargo_calculo calculadora = new Cargo_calculo();
		interface_impressao impressora = new impressao();
		processador_pagamento processador = new processador_pagamento(calculadora, impressora);
		servico_rh rh = new servico_rh(processador);
		Funcionario_inserir_dados app = new Funcionario_inserir_dados(rh);

		app.executar();
	}
}

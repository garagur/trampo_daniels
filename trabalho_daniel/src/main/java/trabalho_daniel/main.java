package trabalho_daniel;

import trabalho_daniel.application.usecases.Cargo_calculo;
import trabalho_daniel.application.usecases.impressao;
import trabalho_daniel.application.usecases.processador_pagamento;
import trabalho_daniel.application.usecases.servico_rh;
import trabalho_daniel.domain.repositories.interface_impressao;
import trabalho_daniel.infrastructure.adapter.Funcionario_inserir_dados;

public class main {
	public static void main(String[] args) {

		Cargo_calculo calculadora = new Cargo_calculo();
		interface_impressao impressora = new impressao();
		processador_pagamento processador = new processador_pagamento(calculadora, impressora);
		servico_rh rh = new servico_rh(processador);
		Funcionario_inserir_dados app = new Funcionario_inserir_dados(rh);

		app.executar();
	}
}

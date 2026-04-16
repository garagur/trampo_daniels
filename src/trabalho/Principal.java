package trabalho;

public class Principal {
	public static void main(String[] args) {

		Cargo_calculo calculadora = new Cargo_calculo();
		interface_impressao impressora = new impressao();
		processador_pagamento processador = new processador_pagamento(calculadora, impressora);
		servico_rh rh = new servico_rh(processador);
		inserir_dados app = new inserir_dados(rh);

		app.executar();
	}
}

package trabalho.domain.entities;

import trabalho.domain.repositories.*;

public class acrecimo_vale_transporte implements interface_descontos {
	public double calcular(double valorBase) {
		if (valorBase <= 3500) {
			return 0;
		}
		return valorBase / 0.8;
	}

	@Override
	public String getNome() {
		return "vale transporte";
	}

	public String getAno() {
		return "2025";
	}

}

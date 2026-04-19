package trabalho.domain.entities;

import trabalho.domain.repositories.*;

public class desconto_INSS26 implements interface_descontos {
	public double calcular(double valorBase) {
		if (valorBase <= 3000) {
			return valorBase * 0.075;
		}
		return valorBase * 0.2;
	}

	@Override
	public String getNome() {
		return "INSS";
	}

	public String getAno() {
		return "2026";
	}

}

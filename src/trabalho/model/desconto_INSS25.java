package trabalho;

public class desconto_INSS25 implements interface_descontos {
	public double calcular(double valorBase) {
		if (valorBase <= 3500) {
			return valorBase * 0.075;
		}
		return valorBase * 0.1;
	}

	@Override
	public String getNome() {
		return "INSS";
	}

	public String getAno() {
		return "2025";
	}

}

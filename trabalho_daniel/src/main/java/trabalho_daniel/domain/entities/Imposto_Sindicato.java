package trabalho_daniel.domain.entities;

import trabalho_daniel.domain.repositories.Imposto;

public class Imposto_Sindicato implements Imposto {

    private static final double VALOR_DESCONTO = 100.0;

    @Override
    public double calcularValorImposto() {
        return VALOR_DESCONTO;
    }

    @Override
    public String getNomeImposto() {
        return "Sindicato";
    }
}
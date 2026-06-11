package trabalho_daniel.domain.entities;

import trabalho_daniel.domain.repositories.Imposto;

public class Imposto_INSS implements Imposto {
    private final double salarioBase;

    public Imposto_INSS(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularValorImposto() {
        return salarioBase * 0.11;
    }

    @Override
    public String getNomeImposto() {
        return "INSS";
    }
}

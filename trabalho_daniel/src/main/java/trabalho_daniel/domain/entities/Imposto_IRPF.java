package trabalho_daniel.domain.entities;

import trabalho_daniel.domain.repositories.Imposto;

public class Imposto_IRPF implements Imposto {
    private final double salarioBase;

    public Imposto_IRPF(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularValorImposto() {
        return salarioBase * 0.15;
    }

    @Override
    public String getNomeImposto() {
        return "IRPF";
    }
}

package trabalho.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Cargo_holerite {
    private final double salarioLiquido;
    private final List<String> extratoDescontos;
    private final List<String> extratoAcrecimos;

    public Cargo_holerite(double salarioLiquido, List<String> extratoDescontos, List<String> extratoAcrecimos) {
        this.salarioLiquido = salarioLiquido;
        this.extratoDescontos = new ArrayList<>(extratoDescontos);
        this.extratoAcrecimos = new ArrayList<>(extratoAcrecimos);
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public List<String> getExtratoDescontos() {
        return extratoDescontos;
    }

    public List<String> getExtratoAcrecimos() {
        return extratoAcrecimos;
    }
}

package trabalho_daniel.infraesturure.cargos;

import trabalho_daniel.domain.repositories.Interface_Cargos;
import trabalho_daniel.domain.repositories.Imposto;

public class DevSenior implements Interface_Cargos {

    private static final double SALARIO_BASE = 8000.0;
    private static final int HORAS_EXIGIDAS = 160;

    private final Imposto[] impostos;

    public DevSenior(Imposto[] impostos) {
        this.impostos = impostos;
    }

    @Override
    public String NomeCargo() {
        return "Desenvolvedor Senior";
    }

    @Override
    public double SalarioBase() {
        return SALARIO_BASE;
    }

    @Override
    public int HorasExigidas() {
        return HORAS_EXIGIDAS;
    }

    @Override
    public Imposto[] getImpostos() {
        return impostos;
    }
}
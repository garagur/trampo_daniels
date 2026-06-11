package trabalho_daniel.use_cases;

import trabalho_daniel.domain.repositories.Imposto;
import trabalho_daniel.domain.repositories.Interface_Cargos;

public class Calculo_Descontos {
    public double calcularImpostos(Interface_Cargos cargo, Imposto[] impostos) {
        if (impostos == null || impostos.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (Imposto imposto : impostos) {
            total += imposto.calcularValorImposto();
        }
        return total;
    }
}
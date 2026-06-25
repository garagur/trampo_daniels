package com.example.trabalhodaniel.user_cases;

import com.example.trabalhodaniel.domain.repository.Imposto;
import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import org.springframework.stereotype.Component;

@Component
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

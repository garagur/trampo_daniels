package com.example.trabalhodaniel.infrastructure.input;

import com.example.trabalhodaniel.controller.FuncionarioController;
import com.example.trabalhodaniel.domain.repository.CargoFactoryPort;
import com.example.trabalhodaniel.domain.repository.Imposto;
import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.infrastructure.descontos.Imposto_INSS;
import com.example.trabalhodaniel.infrastructure.descontos.Imposto_IRPF;
import com.example.trabalhodaniel.infrastructure.descontos.Imposto_Sindicato;
import org.springframework.stereotype.Component;

@Component
public class FuncionariosData {

    private final FuncionarioController controller;
    private final CargoFactoryPort cargoFactory;

    public FuncionariosData(FuncionarioController controller, CargoFactoryPort cargoFactory) {
        this.controller = controller;
        this.cargoFactory = cargoFactory;
    }

    public void registrar() {
        joaoSilva();
        mariaSouza();
        pedroOliveira();
    }

    private void joaoSilva() {
        Interface_Cargos cargo = cargoFactory.criar("DevSenior", new Imposto[0]);
        Imposto[] impostos = new Imposto[] {
                new Imposto_INSS(cargo.SalarioBase()),
                new Imposto_IRPF(cargo.SalarioBase()),
                new Imposto_Sindicato()
        };
        cargo = cargoFactory.criar("DevSenior", impostos);
        controller.processarFuncionario("João Silva", cargo, 10, 0);
    }

    private void mariaSouza() {
        Interface_Cargos cargo = cargoFactory.criar("DevJunior", new Imposto[0]);
        Imposto[] impostos = new Imposto[] {
                new Imposto_INSS(cargo.SalarioBase()),
                new Imposto_IRPF(cargo.SalarioBase())
        };
        cargo = cargoFactory.criar("DevJunior", impostos);
        controller.processarFuncionario("Maria Souza", cargo, 0, 5);
    }

    private void pedroOliveira() {
        Interface_Cargos cargo = cargoFactory.criar("Estagiario", new Imposto[0]);
        Imposto[] impostos = new Imposto[] {
                new Imposto_INSS(cargo.SalarioBase())
        };
        cargo = cargoFactory.criar("Estagiario", impostos);
        controller.processarFuncionario("Pedro Oliveira", cargo, 0, 0);
    }
}
package com.example.trabalhodaniel.infrastructure.input;

import com.example.trabalhodaniel.controller.FuncionarioController;
import com.example.trabalhodaniel.domain.entity.Imposto_INSS;
import com.example.trabalhodaniel.domain.entity.Imposto_IRPF;
import com.example.trabalhodaniel.domain.entity.Imposto_Sindicato;
import com.example.trabalhodaniel.domain.repository.Imposto;
import org.springframework.stereotype.Component;

@Component
public class FuncionariosData {

    private final FuncionarioController controller;

    // O Spring vai injetar o controller aqui automaticamente
    public FuncionariosData(FuncionarioController controller) {
        this.controller = controller;
    }

    public void registrar() {
        joaoSilva();
        mariaSouza();
        pedroOliveira();
    }

    private void joaoSilva() {
        controller.processarFuncionario(
                "João Silva",
                "DevSenior",
                new Imposto[] {
                        new Imposto_INSS(8000.0),
                        new Imposto_IRPF(8000.0),
                        new Imposto_Sindicato()
                },
                10,
                0);
    }

    private void mariaSouza() {
        controller.processarFuncionario(
                "Maria Souza",
                "DevJunior",
                new Imposto[] {
                        new Imposto_INSS(4000.0),
                        new Imposto_IRPF(4000.0)
                },
                0,
                5);
    }

    private void pedroOliveira() {
        controller.processarFuncionario(
                "Pedro Oliveira",
                "Estagiario",
                new Imposto[] {
                        new Imposto_INSS(1500.0)
                },
                0,
                0);
    }
}
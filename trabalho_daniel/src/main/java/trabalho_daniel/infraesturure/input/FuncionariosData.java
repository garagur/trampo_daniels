package trabalho_daniel.infraesturure.input;

import trabalho_daniel.controller.FuncionarioController;
import trabalho_daniel.domain.entities.Imposto_INSS;
import trabalho_daniel.domain.entities.Imposto_IRPF;
import trabalho_daniel.domain.entities.Imposto_Sindicato;
import trabalho_daniel.domain.repositories.Imposto;

public class FuncionariosData {

    private final FuncionarioController controller;

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
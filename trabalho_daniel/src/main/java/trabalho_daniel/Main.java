package trabalho_daniel;

import trabalho_daniel.controller.FuncionarioController;
import trabalho_daniel.infraesturure.cargos.CargoFactory;
import trabalho_daniel.infraesturure.cargos.DevJunior;
import trabalho_daniel.infraesturure.cargos.DevSenior;
import trabalho_daniel.infraesturure.cargos.Estagiario;
import trabalho_daniel.infraesturure.input.FuncionariosData;
import trabalho_daniel.infraesturure.output.ImpressaoConsole;
import trabalho_daniel.use_cases.Calculo_Descontos;
import trabalho_daniel.use_cases.Calculo_horas;
import trabalho_daniel.use_cases.ServicoRH;

public class Main {
    public static void main(String[] args) {

        ImpressaoConsole impressao = new ImpressaoConsole();

        Calculo_Descontos calculoDescontos = new Calculo_Descontos();
        Calculo_horas calculoHoras = new Calculo_horas();
        ServicoRH servicoRH = new ServicoRH(calculoDescontos, calculoHoras, impressao);

        CargoFactory factory = new CargoFactory();
        factory.registrar("DevSenior", impostos -> new DevSenior(impostos));
        factory.registrar("DevJunior", impostos -> new DevJunior(impostos));
        factory.registrar("Estagiario", impostos -> new Estagiario(impostos));

        FuncionarioController controller = new FuncionarioController(servicoRH, factory);

        FuncionariosData dados = new FuncionariosData(controller);
        dados.registrar();
    }
}
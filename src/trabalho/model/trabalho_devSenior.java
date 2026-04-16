package trabalho;

import java.util.List;

public class trabalho_devSenior extends Cargo_Construtor_abstrato {

    public trabalho_devSenior(double salario, List<interface_descontos> descontos,
            List<interface_acrecimos> acrecimos) {
        super("Desenvolvedor Senior", salario);

        for (interface_descontos d : descontos) {
            adicionarDesconto(d);
        }
        for (interface_acrecimos a : acrecimos) {
            adicionarAcrecimo(a);
        }
    }

    @Override
    protected void configurarRegras() {

    }
}
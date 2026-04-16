package trabalho;

import java.util.List;

public class trabalho_devjunior extends Cargo_Construtor_abstrato {

    public trabalho_devjunior(double salario, List<interface_descontos> descontos,
            List<interface_acrecimos> acrecimos) {
        super("Desenvolvedor Júnior", salario);

        for (interface_descontos d : descontos) {
            adicionarDesconto(d);
        }
        for (interface_acrecimos a : acrecimos) {
            adicionarAcrecimo(a);
        }
    }

    @Override
    protected void configurarRegras() {
        // Regras agora são injetadas via construtor (DIP)
    }
}

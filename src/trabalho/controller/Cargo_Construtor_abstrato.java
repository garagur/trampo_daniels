package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Cargo_Construtor_abstrato {
    protected String nomeCargo;
    protected double salarioBruto;
    private List<interface_descontos> listaDescontos = new ArrayList<>();
    private List<interface_acrecimos> listaAcrecimos = new ArrayList<>();

    public Cargo_Construtor_abstrato(String nomeCargo, double salarioBruto) {
        this.nomeCargo = nomeCargo;
        this.salarioBruto = salarioBruto;
    }

    protected abstract void configurarRegras();

    protected void adicionarDesconto(interface_descontos d) {
        this.listaDescontos.add(d);
    }

    protected void adicionarAcrecimo(interface_acrecimos a) {
        this.listaAcrecimos.add(a);
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public List<interface_descontos> getDescontos() {
        return Collections.unmodifiableList(listaDescontos);
    }

    public List<interface_acrecimos> getAcrecimos() {
        return Collections.unmodifiableList(listaAcrecimos);
    }
}
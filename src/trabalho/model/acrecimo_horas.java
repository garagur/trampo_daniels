package trabalho;

public class acrecimo_horas implements interface_acrecimos {
    private double horasExtras;
    private double horasDescontadas;

    public acrecimo_horas(interface_Horas_declaracao user) {
        this.horasExtras = user.getHoras_extras();
        this.horasDescontadas = user.getHoras_descontadas();
    }

    @Override
    public double calcular(double valorBase) {
        double valorhora = valorBase / 220;
        if (this.horasDescontadas >= this.horasExtras) {
            return valorBase;
        }

        double calculoExtra = this.horasExtras * valorhora;
        double tetoMaximo = valorBase + (valorBase * 0.5);

        if (calculoExtra > tetoMaximo) {
            return tetoMaximo;
        }
        return valorBase - calculoExtra;

    }

    @Override
    public String getNome() {
        return "Horas Extras:" + horasExtras + "Hs";
    }

    public String getAno() {
        return "2025";
    }
}
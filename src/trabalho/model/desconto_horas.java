package trabalho;

public class desconto_horas implements interface_descontos {
    private double horasExtras;
    private double horasDescontadas;

    
    public desconto_horas(interface_Horas_declaracao user) {
        this.horasExtras = user.getHoras_extras();
        this.horasDescontadas = user.getHoras_descontadas();
    }

    @Override
    public double calcular(double valorBase) {
    	double valorhora = valorBase/220;
        if (this.horasExtras <= this.horasDescontadas) {
            return valorBase - (horasDescontadas*valorhora);
        } else {
            return valorBase;
        }
    }

    @Override 
    public String getNome() { return "Horas Descontadas:"+ horasDescontadas +"Hs"; } 
    public String getAno() { return "2026"; }
}
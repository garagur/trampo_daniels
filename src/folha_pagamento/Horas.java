package folha_pagamento;

public class Horas {
	private double Horas_ex;
	private double Horas_faltadas = 0;
	
    public Horas(double Horas_ex, double Horas_faltadas) {
        this.Horas_ex = Horas_ex;
        this.Horas_faltadas = Horas_faltadas;
    	}
	
	public double getHoras_ex() {
		return Horas_ex;
	}
	public void setHoras_ex(double horas_ex) {
		Horas_ex = horas_ex;
	}
	public double getHoras_faltadas() {
		return Horas_faltadas;
	}
	public void setHoras_faltadas(double horas_faltadas) {
		Horas_faltadas = horas_faltadas;
	}
	
}

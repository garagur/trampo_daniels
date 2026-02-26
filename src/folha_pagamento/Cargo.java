	package folha_pagamento;
	import java.util.ArrayList; 
	import java.util.List;
	
	public class Cargo {
	    private String titulo;
	    private double salario_bru;
	    private double Jornada_min;
	    private List<Imposto> impostosDoCargo;
	
	    public Cargo(String titulo, double salario_bru, double Jornada_min) {
	        this.titulo = titulo;
	        this.salario_bru = salario_bru;
	        this.Jornada_min = Jornada_min;
	        this.impostosDoCargo = new ArrayList<>();
	    }
	
	    public String getTitulo() {
	        return titulo;
	    }
	
	    public double getSalario_bru() {
	        return salario_bru;
	    }
	
	
	    public void setSalario_bru(double salario_bru) {
	        this.salario_bru = salario_bru;
	        
	    }
	
		public double getJornada_min() {
			return Jornada_min;
		}
	
		public void setJornada_min(double jornada_min) {
			Jornada_min = jornada_min;
		}
		public void adicionarImposto(Imposto imp) {
	        this.impostosDoCargo.add(imp);
	    }

	    public List<Imposto> getImpostosDoCargo() {
	        return impostosDoCargo;
	    }
	      
	}
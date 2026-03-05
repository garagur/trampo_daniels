	package folha_pagamento;
	import java.util.ArrayList; 
	import java.util.List;
	
	public class Cargo {
	    private String titulo;
	    private double salario_bru;
	    private List<Imposto> impostosDoCargo;
	
	    public Cargo(String titulo, double salario_bru) {
	        this.titulo = titulo;
	        this.salario_bru = salario_bru;

	        this.impostosDoCargo = new ArrayList<>();
	    }
	    
	    public String getTitulo() {return titulo;}
	    public double getSalario_bru() {return salario_bru;}
	    public void setSalario_bru(double salario_bru) {this.salario_bru = salario_bru;}
		public void adicionarImposto(Imposto imp) {this.impostosDoCargo.add(imp);}
	    public List<Imposto> getImpostosDoCargo() {return impostosDoCargo;}
	      
		}
package folha_pagamento;

public class Imposto {
	  private String nome_imposto;
	    private double valor;


	    public Imposto(String nome_imposto, double valor) {
	        this.setNome_imposto(nome_imposto);
	        this.setValor(valor);
	    }


		public double getValor() {
			return valor;
		}


		public void setValor(double valor) {
			this.valor = valor;
		}


		public String getNome_imposto() {
			return nome_imposto;
		}


		public void setNome_imposto(String nome_imposto) {
			this.nome_imposto = nome_imposto;
		}
        
}

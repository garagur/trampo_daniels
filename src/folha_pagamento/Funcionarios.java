package folha_pagamento;

public class Funcionarios { 
    private String nome; 
    private String endereco;
    private String NumeroConta;
    private String Banco; 
    double JornadaTraba;

    public Funcionarios(String nome,String endereco,String NumeroConta, String Banco, double JornadaTraba ) {
    	this.nome = nome;
        this.endereco = endereco;
        this.NumeroConta = NumeroConta;
        this.Banco = Banco;
        this.JornadaTraba = JornadaTraba;
    }
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumeroConta() {
		return NumeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		NumeroConta = numeroConta;
	}
	public String getBanco() {
		return Banco;
	}
	public void setBanco(String banco) {
		Banco = banco;
	}
	
	public double getJornadaTraba() {
		return JornadaTraba;
	}

	public void setJornadaTraba(double jornadaTraba) {
		JornadaTraba = jornadaTraba;
	}
 
}
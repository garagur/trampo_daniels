package folha_pagamento;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios { 
	
    private String nome; 
    private String endereco;
    private String NumeroConta;
    private String Banco; 
    private String titulo;
    private double salario_bru;
    private List<Imposto_interface> impostosDoCargo;


    public Funcionarios(String nome,String endereco,String NumeroConta, String Banco, String titulo, double salario_bru) {
    	this.nome = nome;
        this.endereco = endereco;
        this.NumeroConta = NumeroConta;
        this.Banco = Banco;
        this.titulo = titulo;
        this.salario_bru = salario_bru;

        this.impostosDoCargo = new ArrayList<>();
    }
	public String getNome() {return nome;}

	public void setNome(String nome){this.nome = nome;}
	
	public String getEndereco(){return endereco;}
	
	public void setEndereco(String endereco){this.endereco = endereco;}
	
	public String getNumeroConta(){return NumeroConta;}
	
	public void setNumeroConta(String numeroConta) {NumeroConta = numeroConta;}
	
	public String getBanco(){return Banco;}
	
	public void setBanco(String banco) {Banco = banco;}	
	
	public String getTitulo() {return titulo;}
	 
	public double getSalario_bru() {return salario_bru;}
	
	public void setSalario_bru(double salario_bru) {this.salario_bru = salario_bru;}
	
	public void adicionarImposto(Imposto_interface imp) {this.impostosDoCargo.add(imp);}
	
	public List<Imposto_interface> getImpostosDoCargo() {return impostosDoCargo;}
	      
 
}
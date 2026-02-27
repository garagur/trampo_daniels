package folha_pagamento;


public class main {
    public static void main(String[] args) {
    	        	
    	        Pagamentos sistema = new Pagamentos();

    
    	        Imposto inss = new Imposto("INSS", 0.11); 
    	        Imposto fgts = new Imposto("FGTS", 0.08); 
    	        Imposto taxaBanco = new Imposto("Taxa Bancária", 15.00); 


    	        Cargo junior = new Cargo("junior",1000, 120);
    	        Cargo Senior = new Cargo("Senior",5000, 120);
    	        Cargo Estagiario = new Cargo("junior",1000, 120);
    	        
    	        
    	        Senior.adicionarImposto(inss);
    	        Senior.adicionarImposto(fgts);
    	        Senior.adicionarImposto(taxaBanco);

    	        junior.adicionarImposto(inss);
    	        junior.adicionarImposto(taxaBanco);
    	        
    	        
    	        Funcionarios mateus = new Funcionarios("Mateus", "Rua X", "123", "Bradesco", 300);
    	        Funcionarios joao = new Funcionarios("Joao", "Rua Y", "456", "Caixa", 100);

    	        double liqMateus = sistema.calcularLiquido(mateus, Senior, Senior.getImpostosDoCargo());
    

    	        System.out.println("Holerite: " + mateus.getNome());
    	        System.out.println("Cargo: " + junior.getTitulo());
    	        System.out.println("Imposto: " + Senior.getImpostosDoCargo());
    	        System.out.println("Salário Líquido: R$ " + liqMateus);
    	    }
    	}
        
        
        
        

        
        
        
        
      
      
      
      
      
        
    


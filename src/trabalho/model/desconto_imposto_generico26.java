package trabalho;

public class desconto_imposto_generico26 implements interface_descontos{
	  public double calcular(double valorBase) {
	        return valorBase * 0.2;}
	 

	    @Override
	    public String getNome() {
	        return "impostogenerico";
	    }
	    public String getAno() {
	        return "2025";
	    }
	    
}

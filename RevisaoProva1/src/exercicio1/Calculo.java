package exercicio1;

public class Calculo {
	
	public Calculo() {
		
	}
	
	public static double jurosSimples(double capital,double taxa,int tempo) {
		
		double juros = 0.0;
		taxa = (double) taxa/100;
		juros = capital * taxa * tempo;
		return juros;
	}
	
	public static double jurosCompostos(double capital,double taxa,int tempo) {
		
		double juros = 0.0;
		double montante = 0;
		taxa = (double) taxa/100;
		
		montante = (double) capital * Math.pow((1 + taxa),tempo);
		
		juros = montante - capital;
		return juros;
	}
}

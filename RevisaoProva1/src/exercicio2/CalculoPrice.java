package exercicio2;

public class CalculoPrice {
	
	public CalculoPrice() {
		
	}
	
	public static double calculaPrice(double capital,double taxa,double tempo) {
		
		double saldoDevedor = 0;
		taxa = (double) taxa/100;
		double pmt = capital * ((Math.pow((1 + taxa), tempo) * taxa)/(Math.pow((1 + taxa), tempo) - 1));		
		double amortizacao = 0;
		saldoDevedor = capital;
		
		for(int aux = 0; aux < tempo; aux++) {
			
			saldoDevedor -= amortizacao;
			amortizacao = pmt - (saldoDevedor * taxa);
			System.out.println(amortizacao);
		}
		return amortizacao;
	}
}

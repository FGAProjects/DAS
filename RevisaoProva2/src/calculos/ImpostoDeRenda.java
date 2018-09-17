package calculos;

public class ImpostoDeRenda {
	
	public static double baseCalculo(double salario,double pensao,double dependentes) {
		
		double rendimento = 0;
		double valorDependentes = 0;
		
		if(dependentes > 0) {
			
			valorDependentes = dependentes * 189.59;
		}
		
		rendimento = salario - pensao - valorDependentes;
		
		return rendimento;
	}
	
	public static double impostoRenda(double salario,double pensao,double dependentes) {
		
		double baseCalculo = baseCalculo(salario, pensao, dependentes);
		double aliquota = 0;
		double deducao = 0;
		double imposto = 0;
		
		if(baseCalculo <= 1903.98) {
			
			aliquota = 0;
			deducao = 0;
		} else if(baseCalculo > 1903.98 && baseCalculo <= 2826.65) {
			
			aliquota = (double) 7.5/100;
			deducao = 142.80;
		} else if(baseCalculo > 2826.65 && baseCalculo <= 3751.05) {
			
			aliquota = (double) 15/100;
			deducao = 354.80;
		} else if(baseCalculo > 3751.05 && baseCalculo <= 4664.68) {
			
			aliquota = (double) 22.5/100;
			deducao = 636.13;
		} else {
			
			aliquota = (double) 27.5/100;
			deducao = 869.36;
		}
		
		imposto = (baseCalculo * aliquota) - deducao;
		return imposto;
	}
	
	public static double salarioLiquido(double salario,double pensao,double dependentes) {
		
		double salarioLiquido = 0;
		double imposto = impostoRenda(salario, pensao, dependentes);
		
		salarioLiquido = salario - imposto;
		return salarioLiquido;
	}
}
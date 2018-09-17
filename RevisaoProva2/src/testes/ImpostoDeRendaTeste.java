package testes;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculos.ImpostoDeRenda;

@RunWith(Parameterized.class)
public class ImpostoDeRendaTeste extends TestCase{

	@Parameters
	public static Collection<Object[]> impostoDeRenda() {
        return Arrays.asList(new Object[][] {
                 {8119.360000000001,10000,0,0}});
    }
	
	private double salarioLiquido;
	private double salario;
	private double pensao;
	private double dependentes;
	
	public ImpostoDeRendaTeste(double salarioLiquido,double salario,double pensao,double dependentes) {
		
		this.salarioLiquido = salarioLiquido;
		this.salario = salario;
		this.pensao = pensao;
		this.dependentes = dependentes;
	}
	
	@Test
	public void testImpostoDeRenda() {
		
		assertEquals(salarioLiquido, ImpostoDeRenda.salarioLiquido(salario, pensao, dependentes));
	}
}
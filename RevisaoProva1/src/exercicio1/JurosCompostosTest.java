package exercicio1;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(Juros.class)
public class JurosCompostosTest extends TestCase{
	
	/*
	 * Juros Compostos
	 */
	
	@Parameters
	public static Collection<Object[]> jurosCompostos() {
        return Arrays.asList(new Object[][] {
                 {104.62212541120448,1000,1,10},
                 {122.91476785766417,2000,1.2,5},
                 {72.18652733056638,500,1.7,8}});
    }
	
	private double capital;	
	private double juros;
	private double taxa;
	private int tempo;
	
	public JurosCompostosTest(double juros,double capital,double taxa,int tempo) {
		
		this.juros = juros;
		this.capital = capital;
		this.taxa = taxa;
		this.tempo = tempo;
	}
	
	@Test(timeout=500)
	public void testCalculaJurosCompostos() {
		
		assertEquals(juros, Calculo.jurosCompostos(capital, taxa, tempo));
	}
}

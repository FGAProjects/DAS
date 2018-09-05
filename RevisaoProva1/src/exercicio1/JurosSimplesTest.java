package exercicio1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
@IncludeCategory(TSTJuros.class)

public class JurosSimplesTest extends TestCase{
	
	@Parameters
	public static Collection<Object[]> jurosSimples() {
        return Arrays.asList(new Object[][] {
                 {100,1000,1,10},
                 {120,2000,1.2,5},
                 {68,500,1.7,8}});
    }
	
	private double capital;	
	private double juros;
	private double taxa;
	private int tempo;
	
	public JurosSimplesTest(double juros,double capital,double taxa,int tempo) {
		
		this.juros = juros;
		this.capital = capital;
		this.taxa = taxa;
		this.tempo = tempo;
	}
	
	@Test(timeout=500)
	public void testCalculaJurosSimples() throws NumberFormatException {
		
		assertEquals(juros, CalculoJuros.jurosSimples(capital, taxa, tempo));
	}
}

package exercicio2;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(TSTAmortização.class)
public class PriceTest extends TestCase {

	@Parameters
	public static Collection<Object[]> price() {
        return Arrays.asList(new Object[][] {
                 {409.5993154348109,2000,1.2,5},
                 {104.5367094566053,1000,1,10},
                 {66.24901885141425,500,1.7,8}});
    }
	
	private double amortizacao;
	private double capital;
	private double taxa;
	private double tempo;
	
	public PriceTest(double amortizacao,double capital,double taxa,double tempo) {
		
		this.amortizacao = amortizacao;
		this.capital = capital;
		this.taxa = taxa;
		this.tempo = tempo;
	}
	
	@Test(timeout=500)
	public void testCalculaPrice() throws NumberFormatException {
		
		assertEquals(amortizacao, CalculoPrice.calculaPrice(capital, taxa, tempo));
	}
}
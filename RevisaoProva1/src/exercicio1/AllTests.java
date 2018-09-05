package exercicio1;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
	JurosSimplesTest.class,
	JurosCompostosTest.class
})

public class AllTests {
	
}
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.IllegalArgumentException;

public class Bisiestos_Tests {

	/* Caracterizaciones
	c1: Sea un número válido
	   b1: Sea positivo
	   b2: Sea 0
	   b3: Sea 1 o mayor
	c2: Sea un año bisiesto
	   b1: Sea multiplo de 4
	   b2: Si es multiplo de 100, tiene que ser divisible entre 400
	*/

	/*c1*/
	@Test public void positiveInt()
        {
           int a = 3;
           assertEquals("Positive int", false, Bisiestos.esBisiesto(a));
        }

	@Test(expected=IllegalArgumentException.class)
	public void zeroCase()
        {
           int a = 0;
           assertEquals("Zero int", Bisiestos.esBisiesto(a));
        }

	@Test public void oneCase()
        {
           int a = 1;
           assertEquals("One int", false, Bisiestos.esBisiesto(a));
        }



	/*c2*/
	@Test public void validYear()
        {
           int a = 2004;
           assertEquals("Valid Year", true, Bisiestos.esBisiesto(a));
        }

	@Test public void invalidYear()
        {
           int a = 1900;
           assertEquals("Invalid Year", false, Bisiestos.esBisiesto(a));
        }
}

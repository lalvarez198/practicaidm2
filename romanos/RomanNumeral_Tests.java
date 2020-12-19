import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.IllegalArgumentException;

public class RomanNumeral_Tests {

	/* Caracterizaciones
	c1: Sea string null o no
	   b1: Sea null
	   b2: No lo sea
	c2: Sea string valido o no
	   b1: Espacios
	   b2: Letras no validas
	   b3: Numero romano que no cumpla propiedades
	*/

	/*c1*/
	@Test(expected=IllegalArgumentException.class)
	public void nullRomanNumber()
        {
           String a = "456";
           assertEquals("Null Roman Number", RomanNumeral.convierte(a));
        }

	@Test public void validRomanNumber()
        {
           String a = "MCMXC";
           assertEquals("Valid Roman Number", 1990, RomanNumeral.convierte(a));
        }

	/*c2*/
	@Test(expected=IllegalArgumentException.class)
	public void spaceRomanNumber()
        {
           String a = " MCMDC";
           assertEquals("Null Roman Number", RomanNumeral.convierte(a));
        }

	@Test(expected=IllegalArgumentException.class)
	public void nonValidRomanChars()
        {
           String a = "JK";
           assertEquals("Null Roman Number", RomanNumeral.convierte(a));
        }

	@Test(expected=IllegalArgumentException.class)
	public void nonValidRomanNumber()
        {
           String a = "MCDDXLL";
           assertEquals("Null Roman Number", RomanNumeral.convierte(a));
        }

}

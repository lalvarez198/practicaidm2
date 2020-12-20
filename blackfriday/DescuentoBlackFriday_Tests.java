import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.lang.IllegalArgumentException;
import java.util.Calendar;

public class DescuentoBlackFriday_Tests {

	/*Caracterizaciones
	c1: Precio invalido
		b1: Precio menor que 0
		b2: Precio igual a 0
		b3: Precio mayor que 0
		b4: Precio mayor que 0 y black friday
	c2: Descuento invalido
		b1: Descuento menor que 0
		b2: Descuento igual a 0
		b3: Descuento mayor que 0
		b4: Descuento igual a 100
	c3: Black Friday con independencia del año
		b1: 2020
		b2: 2019
	*/

	/*c1 b1*/
	@Test(expected=IllegalArgumentException.class)
	public void negativePriceTest()
        {
           double precioOriginal = -5.0;
	   double porcentajeDescuento = 20.0;
	   Calendar fecha = new GregorianCalendar(2020,12,1);
           assertEquals("Negative Price Test", DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha));
        }

	/*c1 b2*/
	@Test public void zeroPriceTest()
        {
           double precioOriginal = 0.0;
	   double porcentajeDescuento = 20.0;
	   Calendar fecha = new GregorianCalendar(2020,12,1);
	   double delta = 0.0;
           assertEquals("Negative Price Test", 0.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c1 b3*/
	@Test public void positivePriceTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 20.0;
	   Calendar fecha = new GregorianCalendar(2020,12,1);
	   double delta = 0.0;
           assertEquals("Positive Price Test", 100.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c1 b4*/
	@Test public void positivePriceBFridayTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 20.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
	   double delta = 0.0;
           assertEquals("Positive Price Black Friday Test", 80.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c2 b1*/
	@Test(expected=IllegalArgumentException.class)
	public void negativeDiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = -20.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
           assertEquals("Negative Discount Test", DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha));
        }

	/*c2 b2*/
	@Test public void zeroDiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 0.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
	   double delta = 0.0;
           assertEquals("Zero Discount Test", 100.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c2 b3*/
	@Test public void posiveDiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 30.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
	   double delta = 0.0;
           assertEquals("Positive Discount Test", 70.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c2 b4*/
	@Test public void hundredDiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 100.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
	   double delta = 0.0;
           assertEquals("Hundred Discount Test", 0.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c3 b1*/
	@Test public void year20DiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 40.0;
	   Calendar fecha = new GregorianCalendar(2020,11,29);
	   double delta = 0.0;
           assertEquals("2020 Discount Test", 60.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

	/*c3 b2*/
	@Test public void year19DiscountTest()
        {
           double precioOriginal = 100.0;
	   double porcentajeDescuento = 40.0;
	   Calendar fecha = new GregorianCalendar(2019,11,29);
	   double delta = 0.0;
           assertEquals("2019 Discount Test", 60.0, DescuentoBlackFriday.precioFinal(precioOriginal, porcentajeDescuento, fecha), delta);
        }

}

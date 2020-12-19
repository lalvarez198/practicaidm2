

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class Embotelladora_Tests {
	/*Caracterizaciones

	c2: numero nulo de botellas
		b1: numero nulo de botellas pequenas
		b2: numero nulo de botellas grande
	c3: numero suficiente o no de botellas
		b1: numero suficiente de botellas grandes
		b2: numero insuficiente de botellas grandes pero suficiente de pequenas
		b3: numero insuficiente de botellas grandes y pequenas
	*/



	/*c2 b1 y c2 b2*/
	@Test(expected=NoSolution.class)
	public void nullNumBottlesTest() throws NoSolution
        {
           int pequenas = 0;
	   int grandes = 0;
	   int total = 10;
           assertEquals("Null Number Bottles Test", Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
        }

	/*c3 b1*/
	@Test public void enoughNumBigBottlesTest() throws NoSolution
        {
           int pequenas = 0;
	   int grandes = 2;
	   int total = 10;
           assertEquals("Enough Number Big Bottles Test", 0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
        }

	/*c3 b2*/
	@Test public void enoughNumLilBottlesTest() throws NoSolution
        {
           int pequenas = 5;
	   int grandes = 1;
	   int total = 10;
           assertEquals("Enough Number Little Bottles Test", 5, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
        }

	/*c3 b3*/
	@Test(expected=NoSolution.class)
	public void notEnoughBottlesTest() throws NoSolution
        {
           int pequenas = 2;
	   int grandes = 1;
	   int total = 10;
           assertEquals("Enough Number Big Bottles Test", Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
        }


}

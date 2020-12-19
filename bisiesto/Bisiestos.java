import java.lang.IllegalArgumentException;

public class Bisiestos {
	// @param a
	// @return true
	// false
	// @throws IllegalArgumentException

	public static boolean esBisiesto(int a) throws IllegalArgumentException{
		if(a > 0) {
			if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				return true;
			else
				return false;
		}else
			throw new IllegalArgumentException();
	}
}

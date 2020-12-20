import java.lang.IllegalArgumentException;
import java.util.Calendar;
public class DescuentoBlackFriday {
// @param precioOriginal es el precio de un producto marcado en la etiqueta
//porcentajeDescuento es el descuento a aplicar expresado como un porcentaje que ha de ser >= 0
// @return el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
//un descuento de porcentajeDescuento
// @throws IllegalArgumentException si precioOriginal es negativo o porcentajeDescuento es negativo

	public static double precioFinal(double precioOriginal, double porcentajeDescuento, Calendar fecha) throws IllegalArgumentException{

		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		double precioBlackFriday = precioOriginal;
		if(precioOriginal < 0){
			throw new IllegalArgumentException();
		}

		if(porcentajeDescuento < 0 || porcentajeDescuento >100){
			throw new IllegalArgumentException();

		}

		if(dia == 29 && mes == 11){
			precioBlackFriday = precioOriginal * (100-porcentajeDescuento)/100;
		}

		return precioBlackFriday;

	}
}

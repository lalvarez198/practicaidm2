package embotelladora;


public class Embotelladora {
	// @param
	//pequenas: número de botellas en almacén de 1L
	// grandes : número de botellas en almacén de 5L
	//total : número total de litros que hay que embotellar

	// @return
	//número de botellas pequenas necesarias para embotellar el total de lı́quido, teniendo
	//en cuenta que hay que minimizar el número de botellas pequenas: primero
	//se rellenan las grandes

	// @throws NoSolution si no es posible embotellar todo el lı́quido

	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int grandesUsadas = 0;
		String msg = "hola buenas tardes";
		if(grandes != 0 && total >= 5)
			grandesUsadas = Math.min((int)Math.floor(total/grandes) , grandes);
		int litrosRestantes = total - grandesUsadas*5;
		int pequenasUsadas = Math.min(litrosRestantes, pequenas);
		litrosRestantes = litrosRestantes - pequenasUsadas;
		if(litrosRestantes != 0)
			throw new NoSolution(msg);
		return pequenasUsadas;
	}
}

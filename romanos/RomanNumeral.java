import java.lang.IllegalArgumentException;


public class RomanNumeral{

	public static int convierte(String s) throws IllegalArgumentException{

		char Roman[]= {'I','V','X','L','C','D','M'}; //GUARDAN LETRAS A COMPARAR
		int valor[] = {1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS
		int ant = 0;
		int acum = 0;
		int suma = 0;
		boolean found = false;
		char letra = ' ';

		if(s.length() == 0){
			throw new IllegalArgumentException();
		}

		for(int i = 0; i < s.length(); i++){//RECORRER TODA LA FRASE(numero romano)

			letra = s.charAt(i);
			found = false;
			for(int j = 0; j < Roman.length; j++){//RECORRE LISTA NUMEROS ROMANOS

				if(letra == Roman[j]){//SI ENCUENTRA LA LETRA, SUMA, SI NO, LANZA EXCEPCION
					found = true;

					if( ant < valor[j] && ant != 0){ //si el valor de letra anterior menor a valor letra   //actual
						if(ant == 1 || ant == 10 || ant == 100){
							suma = suma - ant*2 ;

						}else	if(ant == 10 && (valor[j] == 50 || valor[j] == 100)){
							suma = suma - ant*2 ;

						}else	if(ant == 100 && (valor[j] == 500 || ant == 1000)){
							suma = suma - ant*2 ;
						}else{
							throw new IllegalArgumentException();
						}
					}

					if (ant == valor[j]){
        					if(valor[j] == 1 || valor[j] == 10 || valor[j] == 100 || valor[j] == 1000){
  							acum = acum +1;
						}else{
							throw new IllegalArgumentException();
						}
  						if (acum > 3){
                                  			throw new IllegalArgumentException();
						}

					}else{
						acum = 1;
					}
					ant = valor[j];//el dato actual se guarda en anterior
					suma = suma + valor[j];
				}
				if(j == Roman.length-1 && found == false){
					throw new IllegalArgumentException();
				}
			}
		}

		return suma;
	}
}

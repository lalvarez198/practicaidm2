import java.lang.IllegalArgumentException;


public class RomanNumeral{

	public static int convierte(String s) throws IllegalArgumentException{

		char Roman[]= {'I','V','X','L','C','D','M'}; //GUARDAN LETRAS A COMPARAR
		int valor[] = {1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS
		int ant = 0;
		int suma = 0;
		char letra = ' ';
		char BadChars[] = {};
		int m = 0;

		for(int i = 0; i < s.length(); i++){//RECORRER TODA LA FRASE(numero romano)

			letra = s.charAt(i);

			for(int j = 0; j < Roman.length; j++){//RECORRE LISTA NUMEROS ROMANOS

				if(letra == Roman[j]){//SI ENCUENTRA LA LETRA, SUMA, SI NO, LANZA EXCEPCION

					suma = suma + valor [j]; //sumar el valor de la letra

					if(ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual
						suma = suma - ant*2;

                    			}
					ant = valor[j];//el dato actual se guarda en anterior

				}else{
					BadChars[m] = letra;
					m++;
				}
			}
		}
		for(int k = 0; k < s.length(); k++){
			for(int l = 1; l <= m; l++){
				if(BadChars[l] != Roman[k]){
					throw new IllegalArgumentException();
				}
			}
		}
		return suma;
	}
}

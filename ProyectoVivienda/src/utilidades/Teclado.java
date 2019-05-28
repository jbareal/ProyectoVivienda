package utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {

	public static String pideDatoCadena(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		return respuesta;
		
	}

}

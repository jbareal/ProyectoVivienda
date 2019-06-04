package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
	
	/**
	 * @param pregunta
	 * @return String
	 * Introducida una cadena por teclado lo devuelve como un string.
	 * 
	 */

	public static String pideDatoCadena(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		}catch (IOException e) {
		}
		return respuesta;
	}
	
	/**
	 * @param pregunta
	 * @return Integer
	 * Introducido un valor numérico por teclado lo devuelve como un Integer.
	 * 
	 */

	public static Integer pideDatoEntero(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta ="";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		}catch (IOException e) {
		}
		 
		return Integer.parseInt(respuesta);
	}

}

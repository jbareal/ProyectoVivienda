package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	public static String pideDatoCadena(String pregunta) {
		@SuppressWarnings("unused")
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		return respuesta;
	}
	
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

	public static Double pideDatoDecimal(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta ="";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		}catch (IOException e) {
		}
		 
		return Double.parseDouble(respuesta);
	}

}

package opcionesMenu;

import java.util.Collections;
import java.util.Comparator;

import controlador.Comparador;
import controlador.GestionLista;
import hospedaje.Hotel;
import hospedaje.Pension;
import tipos.TpCAS;
import tipos.TpEPO;
import tipos.TpPAGO;
import unifamiliar.Particular;
import unifamiliar.Vacacional;
import utilidades.Teclado;
import vivienda.Vivienda;

public class OpcionesMenu {
	
	public static void escogerTipoVivienda() {
		
		System.out.println("Has escogido a�adir vivienda");

		System.out.println("\n Elija el tipo de vivienda en el que desee realizar la acci�n");
		System.out.println("*************************");
		System.out.println("1. Hotel.");
		System.out.println("2. Pensi�n.");
		System.out.println("3. Vacacional.");
		System.out.println("4. Particular.");
	}
	

	public static void aniadirVivienda() {

		escogerTipoVivienda();

		Integer opcion = 0;
		
		try {
		opcion = Teclado.pideDatoEntero("Opci�n escogida: ");
		}
		catch(Exception e) {
		}
		if(opcion <1 || opcion >4) {
			System.out.println("Debe escoger un n�mero del 1 al 4.");
		}else {
		
}
	
		switch (opcion) {
		case 1:
			aniadirHotel();
			break;
		case 2:
			aniadirPension();
			break;
		case 3:
			aniadirVacacional();
			break;
		case 4:
			aniadirParticular();
			break;
		}

	}

	public static void aniadirHotel() {
		
		
		String numCatastro = Teclado.pideDatoCadena("Introduzca un n� de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: Tarjeta, Paypal, Efectivo, Todo: "));
		Integer numHabitaciones = 0;
		
		do {
		try {
		numHabitaciones = Teclado.pideDatoEntero("Introduzca el n� de habitaciones: ");
		
		}catch (Exception e) {
			System.out.println("Debe escribir un n�mero. ");		
		}
		}while (numHabitaciones ==0);
		
		
		Integer numComedores = 0;
		do {
			try {
				numComedores = Teclado.pideDatoEntero("Introduzca el n� de comedores: ");
			}catch (Exception e) {
				System.out.println("Debe escribir un n�mero. ");		
			}
			}while (numHabitaciones ==0);
		
		

		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la �poca de uso: Verano, Invierno, Anual "));

		controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores, tipoEPO));
		listadoVivienda();

	}
	

	public static void aniadirPension() {

		String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago posible: Tarjeta, Paypal, Efectivo, Todo: "));
		String opinionViajeros = Teclado.pideDatoCadena("Introduzca su opini�n: ");
		Integer paxPorHabitacion = Teclado.pideDatoEntero("Introduzca n�mero de personas por habitaci�n: ");
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la �poca de uso: Verano, Invierno, Anual "));
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion, tipoEPO));
		listadoVivienda();
		
	}
	
	public static void aniadirVacacional() {

		
		String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");
		Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
		Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca n� de aparatos de aire acondicionado: ");
		Integer diasOcupado = Teclado.pideDatoEntero("Introduzca : ");
		Integer distanciaPlaya = Teclado.pideDatoEntero("Introduzca n�mero de personas por habitaci�n: ");
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la �poca de uso: Verano, Invierno, Anual "));
				
		controlador.GestionLista.anadir(new Vacacional(numCatastro, numAireAcond,superficie, diasOcupado,distanciaPlaya, tipoEPO ));
		listadoVivienda();
		
	}
	


public static void aniadirParticular() {

	
	String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");		
	Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
	Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca n� de aparatos de aire acondicionado: ");
	Integer numBa�os = Teclado.pideDatoEntero("Introduzca el n�mero de ba�os: ");
	TpCAS tipoCasa = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO ")); 
	
	controlador.GestionLista.anadir(new Particular(numCatastro, superficie, numAireAcond, numBa�os, tipoCasa));
	System.out.println(GestionLista.getLista());
}

	public static void modificarVivienda() {
		
		System.out.println("Has escogido modificar vivienda");
		System.out.println("*************************");
		listadoVivienda();
		
	}

	public static void borrarVivienda() {

		System.out.println("Has escogido borrar vivienda");
		System.out.println("*************************");
		
		listadoVivienda();
		int num = Teclado.pideDatoEntero("Introduzca num de la vivienda a borrar: ");
		controlador.GestionLista.borrar(num);
	}

	public static void listarVivienda() {

		System.out.println("Has escogido listar el contenido de vivienda");
		System.out.println("*************************");
	}

	public static void listadoVivienda() {
		

		Comparator <Vivienda> comparador = new Comparador();
		Collections.sort(controlador.GestionLista.getLista(), comparador);


		int cont = 0;
		for (Vivienda v : controlador.GestionLista.getLista()) {
			if (v instanceof Hotel) {
				Hotel h = (Hotel) v;
				System.out.println((++cont) + " Hotel con n� Catastro: " + h.getNumCatastro() + "," + ", pago con: "
						+ h.getTipoPAGO() + ", n� habitaciones: " + h.getNumHabitaciones()
						+ ", n� de comedores:" + h.getNumComedores()+ ", para la �poca"+ h.getEpoca());
			}
			
			if (v instanceof Pension) {
				Pension p = (Pension) v;
				System.out.println((++cont) + " Pensi�n con n� Catastro: " + p.getNumCatastro() + "," + ", pago con: "
							+ p.getTipoPAGO() + ", opini�n de Viajeros: " + p.getOpinionViajeros()
							+ ", n� de Personas por Habitaci�n:  " + p.getPaxPorHabitacion()+ ", para la �poca: "+ p.getEpoca()) ;
				}
			
			
					
		if (v instanceof Vacacional) {
			Vacacional c = (Vacacional) v;
			System.out.println((++cont) + " Vacacional con n� Catastro: " + c.getNumCatastro() + "," + ", superficie:  "
						+ c.getSuperficie() + ", n� aire acondicionado: " + c.getNumAireAcond()
						+ ", d�as ocupados:  " + c.getDiasOcupado()+ ", distancia a la playa: "+ c.getDistanciaPlaya() + ", para la �poca: " + c.getEpoca()) ;
			}
		
		if (v instanceof Particular) {
			Particular t = (Particular) v;
			System.out.println((++cont) + " Particular con n� Catastro: " + t.getNumCatastro() + "," + ", superficie:  "
						+ t.getSuperficie() + ", n� aire acondicionado: " + t.getNumAireAcond()
						+ ", n� ba�os:  " + t.getNumBa�os()+ ", tipo de casa: "+ t.getTipoCasa()) ;
			}
		
		
		
		}
	}

}



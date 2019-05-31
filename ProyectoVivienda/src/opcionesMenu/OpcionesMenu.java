package opcionesMenu;

import controlador.GestionLista;
import hospedaje.Hotel;
import hospedaje.Pension;
import tipos.TpCAS;
import tipos.TpPAGO;
import unifamiliar.Particular;
import unifamiliar.Vacacional;
import utilidades.Teclado;
import vivienda.Vivienda;

public class OpcionesMenu {

	public static void aniadirVivienda() {

		System.out.println("Has escogido a�adir vivienda");

		System.out.println("\n Elija el tipo de vivienda en el que desee realizar la acci�n");
		System.out.println("*************************");
		System.out.println("1. Hotel.");
		System.out.println("2. Pensi�n.");
		System.out.println("3. Vacacional.");
		System.out.println("4. Particular.");

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

		String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: TARJETA, PAYPAL, EFECTIVO, TODO: "));
		Integer numHabitaciones = Teclado.pideDatoEntero("Introduzca el n� de habitaciones: ");
		Integer numComedores = Teclado.pideDatoEntero("Introduzca el n� de comedores: ");

		controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores));

	}

	public static void aniadirPension() {

		String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: TARJETA, PAYPAL, EFECTIVO, TODO: "));
		String opinionViajeros = Teclado.pideDatoCadena("Introduzca su opini�n: ");
		Integer paxPorHabitacion = Teclado.pideDatoEntero("Introduzca n�mero de personas por habitaci�n: ");
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion));
		listadoVivienda();
		
	}
	
	public static void aniadirVacacional() {

		
		String numCatastro = Teclado.pideDatoCadena("Introduzca el n� de catastro: ");
		Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
		Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca n� de aparatos de aire acondicionado: ");
		Integer diasOcupado = Teclado.pideDatoEntero("Introduzca : ");
		Integer distanaciaPlaya = Teclado.pideDatoEntero("Introduzca n�mero de personas por habitaci�n: ");
				
		controlador.GestionLista.anadir(new Vacacional(numCatastro, numAireAcond,superficie, diasOcupado,distanaciaPlaya ));
		

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
		System.out.println("Has escogido modificar vivienda \n");
		listadoVivienda();
		
		

		
	}

	public static void borrarVivienda() {

		System.out.println("Has escogido borrar vivienda");
		
		listadoVivienda();
		int num = Teclado.pideDatoEntero("Introduzca num de la vivienda a borrar: ");
		controlador.GestionLista.borrar(num);
	}

	public static void listarVivienda() {

		System.out.println("Has escogido listar el contenido de vivienda");
	}

	public static void listadoVivienda() {

		
		

		int cont = 0;
		for (Vivienda v : controlador.GestionLista.getLista()) {
			if (v instanceof Hotel) {
				Hotel h = (Hotel) v;
				System.out.println((++cont) + " Hotel con n� Catastro: " + h.getNumCatastro() + "," + "con pago: "
						+ h.getTipoPAGO() + ", n� habitaciones: " + h.getNumHabitaciones()
						+ "y n� de comedores:" + h.getNumComedores());
			}
			
			if (v instanceof Pension) {
				Pension p = (Pension) v;
				System.out.println((++cont) + " Pensi�n con n� Catastro: " + p.getNumCatastro() + "," + "con pago: "
							+ p.getTipoPAGO() + ", opini�n de Viajeros=" + p.getOpinionViajeros()
							+ "y con n� de Personas por Habitaci�n=" + p.getPaxPorHabitacion());
				}
			
			
					
		}
				
			// faltan otras clases y mil cosas mas
		}

}



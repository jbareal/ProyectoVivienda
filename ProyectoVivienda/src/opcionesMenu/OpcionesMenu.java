package opcionesMenu;

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

		System.out.println("Has escogido añadir vivienda");

		System.out.println("\n Elija el tipo de vivienda en el que desee realizar la acción");
		System.out.println("*************************");
		System.out.println("1. Hotel.");
		System.out.println("2. Pensión.");
		System.out.println("3. Vacacional.");
		System.out.println("4. Particular.");

		Integer opcion = 0;
		
		try {
		opcion = Teclado.pideDatoEntero("Opción escogida: ");
		}
		catch(Exception e) {
		}
		if(opcion <1 || opcion >4) {
			System.out.println("Debe escoger un número del 1 al 4.");
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

		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: TARJETA, PAYPAL, EFECTIVO, TODO: "));
		Integer numHabitaciones = Teclado.pideDatoEntero("Introduzca el nº de habitaciones: ");
		Integer numComedores = Teclado.pideDatoEntero("Introduzca el nº de comedores: ");

		controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores));

	}

	public static void aniadirPension() {

		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: TARJETA, PAYPAL, EFECTIVO, TODO: "));
		String opinionViajeros = Teclado.pideDatoCadena("Introduzca su opinión: ");
		Integer paxPorHabitacion = Teclado.pideDatoEntero("Introduzca número de personas por habitación: ");
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion));

	}
	
	public static void aniadirVacacional() {

		
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
		Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca nº de aparatos de aire acondicionado: ");
		Integer diasOcupado = Teclado.pideDatoEntero("Introduzca : ");
		Integer distanaciaPlaya = Teclado.pideDatoEntero("Introduzca número de personas por habitación: ");
				
		controlador.GestionLista.anadir(new Vacacional(numCatastro, numAireAcond,superficie, diasOcupado,distanaciaPlaya ));

	}
	


public static void aniadirParticular() {

	
	String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");		
	Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
	Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca nº de aparatos de aire acondicionado: ");
	Integer numBaños = Teclado.pideDatoEntero("Introduzca el número de baños: ");
	TpCAS tipoCasa = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO ")); 
	
	controlador.GestionLista.anadir(new Particular(numCatastro, superficie, numAireAcond, numBaños, tipoCasa));

}

	public static void modificarVivienda() {

		System.out.println("Has escogido modificar vivienda");
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

		controlador.GestionLista.anadir(new Hotel("22", TpPAGO.TARJETA, 10, 2));
		controlador.GestionLista.anadir(new Hotel("23", TpPAGO.PAYPAL, 20, 2));

		int cont = 0;
		for (Vivienda v : controlador.GestionLista.getLista()) {
			if (v instanceof Hotel) {
				Hotel h = (Hotel) v;
				System.out.println((++cont) + " Hotel con nº Catastro: " + h.getNumCatastro() + "," + "con pago: "
						+ h.getTipoPAGO() + " y nº habitaciones: " + h.getNumHabitaciones()
						+ ", nº de comedores:" + h.getNumComedores());
			}
			// faltan otras clases y mil cosas mas
		}

	}

}

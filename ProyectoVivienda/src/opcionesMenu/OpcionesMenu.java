package opcionesMenu;

import hospedaje.Hotel;
import hospedaje.Pension;
import tipos.TpPAGO;
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

		switch (opcion) {
		case 1:
			aniadirHotel();
			break;
		case 2:
			aniadirPension();
			break;
		/*
		 * case 2: xxxxx; break; case 3: fgsg; break; case 4: bvdffxv; break;
		 */
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
				System.out.println((++cont) + " Hotel con n� Catastro: " + h.getNumCatastro() + "," + "con pago: "
						+ h.getTipoPAGO() + " y n� habitaciones: " + h.getNumHabitaciones()
						+ ", n� de comedores:" + h.getNumComedores());
			}
			// faltan otras clases y mil cosas mas
		}

	}

}

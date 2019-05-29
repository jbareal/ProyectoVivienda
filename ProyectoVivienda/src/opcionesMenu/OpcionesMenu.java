package opcionesMenu;

import java.util.List;

import hospedaje.Hotel;
import tipos.TpPAGO;
import vivienda.Vivienda;

import java.util.ArrayList;

public class OpcionesMenu {
	
	public static void aniadirVivienda() {
		
		
		System.out.println("Has escogido añadir vivienda");
		}

	public static void modificarVivienda() {
	
	
		System.out.println("Has escogido modificar vivienda");
	}

	public static void borrarVivienda() {
	
	
		System.out.println("Has escogido borrar vivienda");
	}

	public static void listarVivienda() {
		
	List <Vivienda> lstViviendas = new ArrayList<>();
	
	lstViviendas.add(new Hotel ("22", TpPAGO.TARJETA, 10,2));
	lstViviendas.add(new Hotel ("23", TpPAGO.PAYPAL, 20,2));
	
	for (Vivienda v: lstViviendas) {
		if (v instanceof Hotel) {
			System.out.println("Hotel con nº Catastro: " + v.getNumCatastro() + "," + "con pago: " + ((Hotel)v).getTipoPAGO()
					+ "y nº habitaciones: " + ((Hotel)v).getNumHabitaciones()+ ", nº de comedores:" + ((Hotel)v).getNumComedores() );
		}
		// faltan otras clases y mil cosas mas
	}
		
		
		System.out.println("Has escogido listar el contenido de vivienda");
	}


}

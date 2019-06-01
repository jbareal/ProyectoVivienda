# ProyectoVivienda

//Modificaciones en Opciones menú para poder para poder modificar una vivienda

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
		Integer paxPorHabitacion = Teclado.pideDatoEntero("Introduzca número de paxPorHabitación: ");
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion));
		
		
	}
	
	public static void aniadirVacacional() {

		
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
		Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca nº de aparatos de aire acondicionado: ");
		Integer diasOcupado = Teclado.pideDatoEntero("Introduzca días ocupado: ");
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
	     System.out.println(GestionLista.getLista());
   }


public static void modificarVivienda() {
		
	System.out.println("Has escogido modificar vivienda \n");
	
	System.out.println(GestionLista.getLista());		
	
	for(Vivienda v : controlador.GestionLista.getLista()) {
			
		Teclado.pideDatoEntero("Introduzca num de la vivienda a modificar: ");	
						
			if (v instanceof Hotel) {
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("****************************************");
				System.out.println("1. NumCatastro ");
				System.out.println("2. TipoPAGO ");
				System.out.println("3. NumHabitaciones ");
				System.out.println("4. NumComedores ");
				
				Integer opcion = 0;
				
				try {
				opcion = Teclado.pideDatoEntero("Opción escogida: ");
				}
				catch(Exception e) {
				}
				if(opcion <1 || opcion >4) {
					System.out.println("Debe escoger un número del 1 al 4.");
				}else {
				
				   
			
				switch (opcion) {
				case 1:
				v.setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
					break;
				case 2:
				//  v.setTipoPAGO(Teclado.pideDatoCadena("Introduzca el neuvo método de pago: "));
					break;
				case 3:
				//  v.setNumHabitaciones(Teclado.pideDatoEntero("Introuzca el nuevo número de habitaciones"));
					break;
				case 4:
				//  v.setNumComedores(Teclado.pideDatoEntero("Introduzca el nuevo número de habitaciones"));	
					break;
				}					
			     
			  }
		
			}
			
			if (v instanceof Pension) {
					
				
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("****************************************");
				System.out.println("1. NumCatastro ");
				System.out.println("2. TipoPAGO ");
				System.out.println("3. OpinionViajeros ");
				System.out.println("4. PaxPorHabitación ");
					
				Integer opcion = 0;
				
				try {
				opcion = Teclado.pideDatoEntero("Opción escogida: ");
				}
				catch(Exception e) {
				}
				if(opcion <1 || opcion >4) {
				System.out.println("Debe escoger un número del 1 al 4.");
				}else {
					
				    
				
				switch (opcion) {
				case 1:
				      v.setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
					break;
				case 2:
				//  v.setTipoPAGO(Teclado.pideDatoCadena("Introduzca el neuvo método de pago: "));
					break;
				case 3:
				//  v.setNumHabitaciones(Teclado.pideDatoCadena("Introuzca la opinión de los viajeros"));
					break;
				case 4:
				//  v.setNumComedores(Teclado.pideDatoCadena("Introduzca el nuevo tipo de PaxPorHabitación"));	
					break;
				}
			}
		}
				
			if (v instanceof Particular) {
					
				
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("****************************************");
				System.out.println("1. NumCatastro ");
				System.out.println("2. Superficie ");
				System.out.println("3. NumeAireAcond ");
				System.out.println("4. NumBaños ");
				System.out.println("5. TipoCasa ");
					
				Integer opcion = 0;
				
				try {
				opcion = Teclado.pideDatoEntero("Opción escogida: ");
				}
				catch(Exception e) {
				}
				if(opcion <1 || opcion >5) {
				System.out.println("Debe escoger un número del 1 al 5.");
				}else {
					
				   
				
				switch (opcion) {
				case 1:
			   	v.setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
				  break;
				case 2:
				//  v.setSuperficie(Teclado.pideDatoCadena("Introduzca la superficie: "));
				  break;
				case 3:
				//  v.setNumAireAcond(Teclado.pideDatoEntero("Introuzca el número de Aires Acondicionados"));
				  break;
				case 4:
				//  v.setNumBaños(Teclado.pideDatoEntero("Introduzca el número de baños"));	
				  break;
				case 5:
				//  v.setTipoCasa(Teclado.pideDatoCadena("Introduzca el tipo de casa"));
				  break;
				}		
			}
		}	
		    	if (v instanceof Vacacional) {
		    		
		    	
			        System.out.println("****************************************");
				System.out.println("1. NumCatastro ");
				System.out.println("2. Superficie ");
				System.out.println("3. NumeAireAcond ");
				System.out.println("4. Dias Ocupado ");
				System.out.println("5. Distancia a la playa ");
							
				Integer opcion = 0;
							
				try {
				    opcion = Teclado.pideDatoEntero("Opción escogida: ");
				}
				catch(Exception e) {
				}
				if(opcion <1 || opcion >5) {
				System.out.println("Debe escoger un número del 1 al 5.");
				}else {
				
				    
						
				switch (opcion) {
				case 1:
				v.setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
				break;
				case 2:
				//  v.setSuperficie(Teclado.pideDatoEntero("Introduzca la superficie: "));
				break;
				case 3:
				//  v.setNumAireAcond(Teclado.pideDatoEntero("Introuzca el número de Aires Acondicionados"));
				break;
				case 4:
				//  v.setDiasOcupado(Teclado.pideDatoEntero("Introduzca el número dias ocupado"));	
				break;
				case 5:
				//  v.setDistanciaPlaya(Teclado.pideDatoEntero("Introduzca la distancia a la playa"));
				break;
			}
		}
	}		
			
					
     }
}
	


	public static void borrarVivienda() {

		System.out.println("Has escogido borrar vivienda");
		listadoVivienda();
		int num = Teclado.pideDatoEntero("Introduzca num de la vivienda a borrar: ");
		controlador.GestionLista.borrar(num);
		}
		
	
	


	
	public static void listarVivienda() {

		System.out.println("Has escogido listar el contenido de vivienda");
		listadoVivienda();
	}

	public static void listadoVivienda() {
		

		int cont = 0;
		for (Vivienda v : controlador.GestionLista.getLista()) {
			if (v instanceof Hotel) {
				Hotel h = (Hotel) v;
				System.out.println((++cont) + " Hotel con nº Catastro: " + h.getNumCatastro() + "," + "con pago: "
						+ h.getTipoPAGO() + ", nº habitaciones: " + h.getNumHabitaciones()
						+ "y nº de comedores:" + h.getNumComedores());
			}
			
			if (v instanceof Pension) {
				Pension p = (Pension) v;
				System.out.println((++cont) + " Pensión con nº Catastro: " + p.getNumCatastro() + "," + "con pago: "
							+ p.getTipoPAGO() + ", opinión de Viajeros=" + p.getOpinionViajeros()
							+ "y con nº de Personas por Habitación=" + p.getPaxPorHabitacion());
				}
			
			
					
		}
				
			// faltan otras clases y mil cosas mas
	}

}

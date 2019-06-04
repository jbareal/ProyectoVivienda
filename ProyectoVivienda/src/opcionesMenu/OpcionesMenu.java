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
	
/**
 * 
 * Este método es para elegir el tipo de vivienda que vamos a añadir.
 * 
 */
	public static void aniadirVivienda() {

		Integer opcion = 0;
		
		do {
			System.out.println("\n Elija el tipo de vivienda:");
			System.out.println("******************************************");
			System.out.println("1. Hotel.");
			System.out.println("2. Pensión.");
			System.out.println("3. Vacacional.");
			System.out.println("4. Particular.");
		
		try {
			System.out.println("***************");
		opcion = Teclado.pideDatoEntero("Opción Elegida: ");
		}
		catch(Exception e) {
		}
		if(opcion <1 || opcion >4) {
			System.out.println("Debe elegir un número del 1 al 4.");
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
		}while (opcion ==0);
		
	}
	/**
	 * 
	 * Añade un hotel a la lista de viviendas.
	 * 
	 */

	public static void aniadirHotel() {
		
		System.out.println("\nIntroduzca los siguientes datos para el Hotel");
		System.out.println("*********************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		

		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: Tarjeta, Paypal, Efectivo, Todo: "));
		while (tipoPAGO == null) { 
			try {
				System.out.println("\nDebe elegir un tipo de pago válido.");
		tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: Tarjeta, Paypal, Efectivo, Todo: "));
			}catch (Exception e) {
			}
		}
		
		Integer numHabitaciones = 0;
		do {
			try {
				numHabitaciones = Teclado.pideDatoEntero("Introduzca el nº de habitaciones: ");
			}catch (Exception e) {		
			System.out.println("\nDebe escribir un número");
			}
		}while (numHabitaciones ==0);
		
		
		Integer numComedores = 0;
		do {
			try {
				numComedores = Teclado.pideDatoEntero("Introduzca el nº de comedores: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");		
			}
			}while (numComedores ==0);

		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
		while (tipoEPO == null) { 
			try {
				System.out.println("\nDebe escribir una época válida.");
		tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
			}catch (Exception e) {
			}
		}
			controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores,tipoEPO));
			System.out.println("\nHa añadido un nuevo HOTEL a la lista.");
			System.out.println("Para ver la lista de viviendas pulse la opción 4 en el Menú Principal.");
	}
		
		

	/**
	 * 
	 * Añade una pensión a la lista de viviendas.
	 * 
	 */

	public static void aniadirPension() {

		System.out.println("\nIntroduzca los siguientes datos para la Pensión");
		System.out.println("***********************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago posible: Tarjeta, Paypal, Efectivo, Todo: "));
		while (tipoPAGO == null) { 
			try {
				System.out.println("\nDebe escribir un tipo de pago válido.");
		tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: Tarjeta, Paypal, Efectivo, Todo: "));
			}catch (Exception e) {
			}
		}
		
		String opinionViajeros = Teclado.pideDatoCadena("Introduzca su opinión: ");
		
		Integer paxPorHabitacion = 0;
		do {
			try {
				paxPorHabitacion = Teclado.pideDatoEntero("Introduzca número de personas por habitación: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");	
			}
		}while (paxPorHabitacion ==0);
		
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
		while (tipoEPO == null) { 
			try {
				System.out.println("\nDebe escribir un tipo de época válido.");
		tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
			}catch (Exception e) {
			}
		}
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion, tipoEPO));
		System.out.println("\nHa añadido una nueva PENSIÓN a la lista.");
		System.out.println("Para ver el listado de viviendas pulse la opción 4 en el Menú Principal.");
	
	}
	
	/**
	 * 
	 * Añade una vivienda vacacional a la lista de viviendas.
	 * 
	 */
	
	public static void aniadirVacacional() {

		System.out.println("\nIntroduzca los siguientes datos para la vivienda Vacacional");
		System.out.println("***********************************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		
		Integer superficie =0;
		do {
			try {
				superficie = Teclado.pideDatoEntero("Introduzca la superficie, en metros: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");
			}
		}while (superficie ==0);
		
		Integer numAireAcond =0;
		do {
			try {
				numAireAcond =  Teclado.pideDatoEntero("Introduzca el nº de aparatos de aire acondicionado: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");
			}
		}while (numAireAcond ==0);
		
		Integer diasOcupado=0;
		do {
			try {
				diasOcupado = Teclado.pideDatoEntero("Introduzca los días de cocupación: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");
			}
		}while (diasOcupado ==0);
		
		Integer distanciaPlaya=0;
		do {
			try {
				distanciaPlaya = Teclado.pideDatoEntero("Introduzca la distacia a la playa, en metros: ");
			}catch (Exception e) {
				System.out.println("\nDebe escribir un número");
			}
		}while (distanciaPlaya ==0);
		
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual "));
		while (tipoEPO == null) { 
			try {
				System.out.println("\nDebe escribir un tipo de época válido.");
		tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
			}catch (Exception e) {
			}
		}
		controlador.GestionLista.anadir(new Vacacional(numCatastro, superficie,numAireAcond, diasOcupado,distanciaPlaya, tipoEPO));
		System.out.println("\nHa añadido una nueva VIVIENDA VACACIONAL a la lista.");
		System.out.println("Para ver el listado de viviendas pulse la opción 4 en el Menú Principal.");
	}
	

	/**
	 * 
	 * Añade una vivienda particular a la lista de viviendas.
	 * 
	 */
public static void aniadirParticular() {

	System.out.println("\nIntroduzca los siguientes datos para la vivienda Particular");
	System.out.println("**********************************************************");
	String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");		
	Integer superficie =0;
	do {
		try {
			superficie = Teclado.pideDatoEntero("Introduzca la superficie, en metros: ");
		}catch (Exception e) {
			System.out.println("\nDebe escribir un número");
		}
	}while (superficie ==0);
	
	Integer numAireAcond =0;
	do {
		try {
			numAireAcond =  Teclado.pideDatoEntero("Introduzca el nº de aparatos de aire acondicionado: ");
		}catch (Exception e) {
			System.out.println("\nDebe escribir un número");
		}
	}while (numAireAcond ==0);
	
	Integer numBanos=0;
	do {
		try {
			numBanos = Teclado.pideDatoEntero("Introduzca el nº de baños: ");
		}catch (Exception e) {
			System.out.println("\nDebe escribir un número");
		}
	}while (numBanos ==0);
	
	TpCAS tipoCASA = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO ")); 
	while (tipoCASA == null) { 
		try {
			System.out.println("\nDebe escribir un tipo de casa válido.");
	tipoCASA = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO "));
		}catch (Exception e) {
		}
	}
	
	controlador.GestionLista.anadir(new Particular(numCatastro, superficie, numAireAcond, numBanos, tipoCASA));
	System.out.println("\nHa añadido una nueva VIVIENDA PARTICULAR a la lista.");
	System.out.println("Para ver el listado de viviendas pulse la opción 4 en el Menú Principal.");
}

/**
 * 
 * Modifica una vivienda según el tipo de la lista de viviendas.
 * 
 */
public static void modificarVivienda() {
	
	System.out.println("\nHa elegido la opción de modificar vivienda");
	System.out.println("******************************************");
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	listadoVivienda();
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	
			
	if (GestionLista.tamanio()==0){
		
		System.out.println("La lista no está vacia");
	}else {
		//listadoVivienda();
		int option=0;
		
		try {
			option = Teclado.pideDatoEntero("Introduzca el nº de la vivienda a modificar: ");
			}catch (Exception e) {
				
			}
		   if (option < 1 || option > GestionLista.tamanio()) {
			   System.out.println("Debe elegir un elemento de la lista");
		   }else {
		     
			  option--;
			  Vivienda v = controlador.GestionLista.get(option);
		  
		  
		  switch (option) {
		  case 1:
		         				 
									
					
			if (v instanceof Hotel) {
					
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("****************************************");
				System.out.println("1. Número de catastro ");
				System.out.println("2. Tipo de pago ");
				System.out.println("3. Número de habitaciones ");
				System.out.println("4. Número de comedores ");
				System.out.println("5. Época");
						
											
					String opcionH;
					opcionH = Teclado.pideDatoCadena("Opción elegida: ");
					switch (opcionH) {
					case "1":
						if (v instanceof Hotel)
						((Hotel)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
						break;
					case "2":
						if (v instanceof Hotel)
					    ((Hotel)v).setTpPAGOHospedaje(utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago posible: Tarjeta, Paypal, Efectivo, Todo: ")));
						break;
					case "3":
						if (v instanceof Hotel)
					   ((Hotel)v).setNumHabitaciones(Teclado.pideDatoEntero("Introduzca el nuevo numero de habitaciones: "));
						break;
					case "4":
						if (v instanceof Hotel)
					  ((Hotel)v).setNumComedores(Teclado.pideDatoEntero("Introduzca el nuevo número de comedores: "));	
						break;
					case "5":
						if (v instanceof Hotel)
					  ((Hotel)v).setTipoEPO(utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual ")));	
						break;
					default:
			            System.out.println("error");	
			            break;		
						
				   	}	      
			}
			
				    
			
			 
			case 2:
				 
				    if (v instanceof Pension) {
					System.out.println("Seleccione el atributo que desee modificar: ");
					System.out.println("****************************************");
					System.out.println("1. Número de catastro ");
					System.out.println("2. Tipo de pago ");
					System.out.println("3. Opinion de viajeros ");
					System.out.println("4. Personas por habitación ");
					System.out.println("5. Época");
							
					String opcionP; 
					opcionP = Teclado.pideDatoCadena("Opción elegida: ");
					
					switch (opcionP) {
					case "1":
						((Pension)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
						break;
					case "2":
					  ((Pension)v).setTipoPAGO(utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago posible: Tarjeta, Paypal, Efectivo, Todo: ")));
						break;
					case "3":
					    ((Pension)v).setOpinionViajeros(Teclado.pideDatoCadena("Introduzca la opinión de los viajeros: "));
						break;
					case "4":
						((Pension)v).setPaxPorHabitacion(Teclado.pideDatoEntero("Introduzca el nuevo número de personas por habitación: "));	
						break;
					case "5":
				        ((Pension)v).setEpoca(utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual ")));	
					     break;
					     
					default:
			            System.out.println("error");	
			            break;   
					}   
					
				}
				   
			  case 3:
					  if (v instanceof Particular) {
							
						System.out.println("Seleccione el atributo que desee modificar: ");
						System.out.println("****************************************");
						System.out.println("1. Número de catastro ");
						System.out.println("2. Superficie ");
						System.out.println("3. Nº de aires acondicionados ");
						System.out.println("4. Número de baños ");
						System.out.println("5. Tipo de casa ");
								
						String opcion;
						opcion = Teclado.pideDatoCadena("Opción elegida: ");
		     
						switch (opcion) {
						case "1":
							((Particular)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
							break;
						case "2":
						  ((Particular)v).setSuperficie(Teclado.pideDatoEntero("Introduzca la superficie: "));
							break;
						case "3":
						  ((Particular)v).setNumAireAcond(Teclado.pideDatoEntero("Introduzca el número de aires acondicionados: "));
							break;
						case "4":
							 ((Particular)v).setNumBanos(Teclado.pideDatoEntero("Introduzca el número de baños: "));	
							break;
						case "5":
							((Particular)v).setTipoCASA(utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: Adosado, Pareado, Piso ")));
							break;
						default:
				            System.out.println("error");	
				            break;	
					}	
						
				  }
					 
					
			  case 4:
				  
					  if (v instanceof Vacacional) {
				   
					  System.out.println("****************************************");
					  System.out.println("1. Número de catastro ");
					  System.out.println("2. Superficie ");
					  System.out.println("3. Número de aires acondicionados  ");
					  System.out.println("4. Días Ocupado ");
					  System.out.println("5. Distancia a la playa ");
					  System.out.println("6. Época");
										
					  String opcionV;	
					  opcionV = Teclado.pideDatoCadena("Opción elegida: ");
		
					  switch (opcionV) {
						case "1":
						((Vacacional)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
						     break;
						case "2":
					        ((Vacacional) v).setSuperficie(Teclado.pideDatoEntero("Introduzca la superficie: "));
						     break;
						case "3":
						((Vacacional) v).setNumAireAcond(Teclado.pideDatoEntero("Introduzca el número de Aires Acondicionados: "));
						      break;
						case "4":
						 ((Vacacional)v).setDiasOcupado(Teclado.pideDatoEntero("Introduzca el número de dias ocupado: "));	
						break;
						case "5":
						 ((Vacacional)v).setDistanciaPlaya(Teclado.pideDatoEntero("Introduzca la distancia a la playa: "));
						break;
						case "6":
					        ((Vacacional)v).setTipoEPO(utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual ")));	
						      break;
				        default:
				            System.out.println("error");	
				            break;
					  }	
				
				  }
					  break;
			  default: 
				  System.out.println("salir");
				  
		     }   
            
           	 
		   }
	}
	   	
			
}		
		    	
/**
 * 
 * Borra una vivienda de una posición de la lista de viviendas.
 * 
 */	

	public static void borrarVivienda() {

		System.out.println("\nHa elegido la opción borrar vivienda");
		System.out.println("************************************");
		
		if(GestionLista.tamanio()==0) {
			System.out.println("La lista de viviendas está vacia");
		}else {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
			listadoVivienda();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
			int num=0;
			try {
			num = Teclado.pideDatoEntero("\nIntroduzca el nº de la vivienda a borrar: ");
			System.out.println("**********************************************");
			}catch(Exception e) {
			}
			if(num<1 || num>GestionLista.tamanio()) {
				System.out.println("Debe elegir un elemento de la lista.");	
			}else {	
			
			controlador.GestionLista.borrar(num-1);
			System.out.println("Ha borrado la vivienda nº: "+num);	
			System.out.println("Para ver el listado de viviendas pulse la opción 4 en el Menú Principal.");
			}
		}
	}
	
	
	
	/**
	 * 
	 * Imprime la lista de viviendas.
	 * 
	 */
	
	public static void listarVivienda() {

		System.out.println("\nHa elegido la opción listar el contenido de vivienda");
		System.out.println("****************************************************");
		
		if(GestionLista.tamanio()==0) {
			System.out.println("La lista de viviendas está vacia");
		}else {
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		listadoVivienda();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	/**
	 * 
	 * Usa un comparador para ordenar la lista de viviendas.
	 * 
	 */

	public static void listadoVivienda() {
		

		Comparator <Vivienda> comparador = new Comparador();
		Collections.sort(controlador.GestionLista.getLista(), comparador);


		int cont = 0;
		for (Vivienda v : controlador.GestionLista.getLista()) {
			if (v instanceof Hotel) {
				Hotel h = (Hotel) v;
				System.out.println((++cont) + " Hotel con [nº Catastro: " + h.getNumCatastro() + "," + " Pago con: "
						+ h.getTipoPAGO() + ", nº habitaciones: " + h.getNumHabitaciones()
						+ ", nº de comedores: " + h.getNumComedores()+ ", Para la época: "+ h.getEpoca()+"]");
			}
			
			if (v instanceof Pension) {
				Pension p = (Pension) v;
				System.out.println((++cont) + " Pensión con [nº Catastro: " + p.getNumCatastro() + "," + " Pago con: "
							+ p.getTipoPAGO() + ", Opinión de Viajeros: " + p.getOpinionViajeros()
							+ ", nº de Personas por Habitación:  " + p.getPaxPorHabitacion()+ ", Para la época: "+ p.getEpoca()+"]") ;
				}
			
			
					
		if (v instanceof Vacacional) {
			Vacacional c = (Vacacional) v;
			System.out.println((++cont) + " Vivienda vacacional con [nº Catastro: " + c.getNumCatastro() + "," + " Superficie:  "
						+ c.getSuperficie() + " metros cuadrados, nº de aires acondicionados: " + c.getNumAireAcond()
						+ ", Días de ocupación:  " + c.getDiasOcupado()+ ", Distancia a la playa: "+ c.getDistanciaPlaya() + " metros, Para la época: " + c.getEpoca()+"]") ;
			}
		
		if (v instanceof Particular) {
			Particular t = (Particular) v;
			System.out.println((++cont) + " Vivienda particular con [nº Catastro: " + t.getNumCatastro() + "," + " Superficie:  "
						+ t.getSuperficie() + " metros cuadrados, nº de aires acondicionados: " + t.getNumAireAcond()
						+ ", nº de baños:  " + t.getNumBanos()+ ", Tipo de casa: "+ t.getTipoCASA()+"]") ;
			}
		
		
		
		}
	}
}






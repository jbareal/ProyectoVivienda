package opcionesMenu;

import java.util.Collections;
import java.util.Comparator;

import controlador.Comparador;
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
		
		System.out.println("\nHa elegido la opción de añadir vivienda");
		System.out.println("***************************************");

		System.out.println("Elija el tipo de vivienda que desea añadir");
		System.out.println("******************************************");
		System.out.println("1. Hotel.");
		System.out.println("2. Pensión.");
		System.out.println("3. Vacacional.");
		System.out.println("4. Particular.");
		
	}
	

	public static void aniadirVivienda() {

		escogerTipoVivienda();

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
		
		System.out.println("\nIntroduzca los siguientes datos para el Hotel");
		System.out.println("*********************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago: Tarjeta, Paypal, Efectivo, Todo: "));
		
		Integer numHabitaciones = 0;
		do {
		try {
		numHabitaciones = Teclado.pideDatoEntero("Introduzca el nº de habitaciones: ");
		
		}catch (Exception e) {
			System.out.println("Debe escribir un número. ");		
		}
		}while (numHabitaciones ==0);
		
		
		Integer numComedores = 0;
		do {
			try {
				numComedores = Teclado.pideDatoEntero("Introduzca el nº de comedores: ");
			}catch (Exception e) {
				System.out.println("Debe escribir un número. ");		
			}
			}while (numComedores ==0);
		
		

		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));

		//controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores, tipoEPO));
		controlador.GestionLista.anadirHotel(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores));
		//He modificado los metodos para añadir en GestionLista
		listadoVivienda();

	}
	

	public static void aniadirPension() {

		System.out.println("\nIntroduzca los siguientes datos para la Pensión");
		System.out.println("***********************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		TpPAGO tipoPAGO = utilidades.ConvertirTipo.toTpPAGO(Teclado.pideDatoCadena("Introduzca el tipo de pago posible: Tarjeta, Paypal, Efectivo, Todo: "));
		String opinionViajeros = Teclado.pideDatoCadena("Introduzca su opinión: ");
		Integer paxPorHabitacion = Teclado.pideDatoEntero("Introduzca número de personas por habitación: ");
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual: "));
		
		//controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion, tipoEPO));
		controlador.GestionLista.anadirPension(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion));
		listadoVivienda();
		
	}
	
	public static void aniadirVacacional() {

		System.out.println("\nIntroduzca los siguientes datos para la vivienda Vacacional");
		System.out.println("***********************************************************");
		String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");
		Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie, en metros: ");
		Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca el nº de aparatos de aire acondicionado: ");
		Integer diasOcupado = Teclado.pideDatoEntero("Introduzca los días de cocupación: ");
		Integer distanciaPlaya = Teclado.pideDatoEntero("Introduzca la distacia a la playa, en metros: ");
		TpEPO tipoEPO = utilidades.ConvertirTipo.toTpEPO(Teclado.pideDatoCadena("Introduzca la época de uso: Verano, Invierno, Anual "));
				
		//controlador.GestionLista.anadir(new Vacacional(numCatastro, superficie, numAireAcond, diasOcupado,distanciaPlaya, tipoEPO ));
		controlador.GestionLista.anadirVac1(new Vacacional(numCatastro, numAireAcond,superficie, diasOcupado,distanaciaPlaya ));
		listadoVivienda();
		
	}
	


public static void aniadirParticular() {

	System.out.println("\nIntroduzca los siguientes datos para la vivienda Particular");
	System.out.println("**********************************************************");
	String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");		
	Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
	Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca nº de aparatos de aire acondicionado: ");
	Integer numBaños = Teclado.pideDatoEntero("Introduzca el número de baños: ");
	TpCAS tipoCASA = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO ")); 
	
	//controlador.GestionLista.anadir(new Particular(numCatastro, superficie, numAireAcond, numBaños, tipoCASA));
	controlador.GestionLista.anadirParticular(new Particular(numCatastro, superficie, numAireAcond, numBaños, tipoCasa));
	listadoVivienda();
}

	public static void modificarVivienda() {
		
		System.out.println("\nHa elegido la opción de modificar vivienda");
		System.out.println("******************************************");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		listadoVivienda();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

		for(Vivienda v : controlador.GestionLista.getLista()) {
				
			Teclado.pideDatoEntero("Introduzca el nº de la vivienda a modificar: ");	
			
							
				if (v instanceof Hotel) {
					System.out.println("Seleccione el atributo que desee modificar: ");
					System.out.println("****************************************");
					System.out.println("1. NumCatastro ");
					System.out.println("2. TipoPAGO ");
					System.out.println("3. NumHabitaciones ");
					System.out.println("4. NumComedores ");
					
					Integer opcion = 0;
					
					try {
					opcion = Teclado.pideDatoEntero("Opción elegida: ");
					}
					catch(Exception e) {
					}
					if(opcion <1 || opcion >4) {
						System.out.println("Debe elegir un número del 1 al 4.");
					}else {
					
					switch (opcion) {
				case 1:
					((Hotel)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
					break;
				case 2:
				    //((Hotel)v).setTipoEPO(Teclado.pideDatoCadena("Introduzca el neuvo método de pago: "));
					break;
				case 3:
				   ((Hotel)v).setNumHabitaciones(Teclado.pideDatoEntero("Introuzca el nuevo número de habitaciones: "));
					break;
				case 4:
				  ((Hotel)v).setNumComedores(Teclado.pideDatoEntero("Introduzca el nuevo número de comedores: "));	
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
					opcion = Teclado.pideDatoEntero("Opción elegida: ");
					}
					catch(Exception e) {
					}
					if(opcion <1 || opcion >4) {
					System.out.println("Debe elegir un número del 1 al 4.");
					}else {
						
					switch (opcion) {
					case 1:
						((Pension)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
						break;
					case 2:
					  //  ((Pension)v).setTipoPAGO(Teclado.pideDatoCadena("Introduzca el neuvo método de pago: "));
						break;
					case 3:
					    ((Pension)v).setOpinionViajeros(Teclado.pideDatoCadena("Introuzca la opinión de los viajeros: "));
						break;
					case 4:
						((Pension)v).setPaxPorHabitacion(Teclado.pideDatoEntero("Introduzca el nuevo tipo de PaxPorHabitación: "));	
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
					opcion = Teclado.pideDatoEntero("Opción elegida: ");
					}
					catch(Exception e) {
					}
					if(opcion <1 || opcion >5) {
					System.out.println("Debe elagir un número del 1 al 5.");
					}else {
						
					switch (opcion) {
					case 1:
						((Particular)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
						break;
					case 2:
					  ((Particular)v).setSuperficie(Teclado.pideDatoEntero("Introduzca la superficie: "));
						break;
					case 3:
					  ((Particular)v).setNumAireAcond(Teclado.pideDatoEntero("Introuzca el número de Aires Acondicionados"));
						break;
					case 4:
						 ((Particular)v).setNumBaños(Teclado.pideDatoEntero("Introduzca el número de baños"));	
						break;
					case 5:
						//((Particular)v).setTipoCasa(Teclado.pideDatoCadena("Introduzca el tipo de casa"));
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
					    opcion = Teclado.pideDatoEntero("Opción elegida: ");
					}
					catch(Exception e) {
					}
					if(opcion <1 || opcion >5) {
					System.out.println("Debe elegir un número del 1 al 5.");
					}else {
					
					switch (opcion) {
					case 1:
					((Vacacional)v).setNumCatastro(Teclado.pideDatoCadena("Introduzca el nº de catastro: "));
					     break;
					case 2:
				        ((Vacacional) v).setSuperficie(Teclado.pideDatoEntero("Introduzca la superficie: "));
					     break;
					case 3:
					((Vacacional) v).setNumAireAcond(Teclado.pideDatoEntero("Introuzca el número de Aires Acondicionados"));
					      break;
					case 4:
					 ((Vacacional)v).setDiasOcupado(Teclado.pideDatoEntero("Introduzca el número dias ocupado"));	
					break;
					case 5:
					 ((Vacacional)v).setDistanciaPlaya(Teclado.pideDatoEntero("Introduzca la distancia a la playa"));
					break;
			       }    
							
					
			}
		}		
		else{
		}	
		listadoVivienda();				
	 }
	}

	public static void borrarVivienda() {

		System.out.println("\nHa elegido la opción borrar vivienda");
		System.out.println("************************************");
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		listadoVivienda();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		int num = Teclado.pideDatoEntero("\nIntroduzca el nº de la vivienda a borrar: ");
		controlador.GestionLista.borrar(num-1);
		listadoVivienda();
	}

	public static void listarVivienda() {

		System.out.println("\nHa elegido la opción listar el contenido de vivienda");
		System.out.println("****************************************************");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		listadoVivienda();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}

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
						+ ", nº de baños:  " + t.getNumBaños()+ ", Tipo de casa: "+ t.getTipoCASA()+"]") ;
			}
		
		
		
		}
	}
	
	
/*
Mirad el siguiente método por si pudiese servir para algo
*/
	

public static List<Vivienda>getViviendasPorTipo(String tipo){
	Stream<Vivienda> v = null;
	List<Vivienda> list = GestionLista.getLista();
	Collections.sort(list, (i1,i2) -> i1.getNumCatastro().compareTo(i2.getNumCatastro()));		
			
	switch(tipo.toUpperCase()){
	   case "HOTELES":
		v = list.stream().filter(p-> p instanceof Hotel);
		break;
			
	   case "PENSIONES":
	         v = list.stream().filter(p-> p instanceof Pension);
		break;
					
	   case "PARTICULAR":
		  v = list.stream().filter(p-> p instanceof Particular);
		break;
	
	   case "VACACIONAL":
		   v = list.stream().filter(p->p instanceof Vacacional);
		break;
		default:
		   v = list.stream();
	}
					
	return	v.collect(Collectors.toList());	
    }	
	
}



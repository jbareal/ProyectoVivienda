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
		
		System.out.println("\nHas elegido la opción de añadir vivienda");
		System.out.println("****************************************");

		System.out.println("\nElija el tipo de vivienda en el que desee realizar la acción");
		System.out.println("************************************************************");
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

		controlador.GestionLista.anadir(new Hotel(numCatastro, tipoPAGO, numHabitaciones, numComedores, tipoEPO));
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
		
		controlador.GestionLista.anadir(new Pension(numCatastro, tipoPAGO, opinionViajeros, paxPorHabitacion, tipoEPO));
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
				
		controlador.GestionLista.anadir(new Vacacional(numCatastro, numAireAcond,superficie, diasOcupado,distanciaPlaya, tipoEPO ));
		listadoVivienda();
		
	}
	


public static void aniadirParticular() {

	System.out.println("\nIntroduzca los siguientes datos para la vivienda Particular");
	System.out.println("*******************************************************");
	String numCatastro = Teclado.pideDatoCadena("Introduzca el nº de catastro: ");		
	Integer superficie = Teclado.pideDatoEntero("Introduzca la superficie: ");
	Integer numAireAcond =  Teclado.pideDatoEntero("Introduzca nº de aparatos de aire acondicionado: ");
	Integer numBaños = Teclado.pideDatoEntero("Introduzca el número de baños: ");
	TpCAS tipoCasa = utilidades.ConvertirTipo.toTpCAS(Teclado.pideDatoCadena("Introduzca el tipo de casa: ADOSADO, PAREADO, PISO ")); 
	
	controlador.GestionLista.anadir(new Particular(numCatastro, superficie, numAireAcond, numBaños, tipoCasa));
	System.out.println(GestionLista.getLista());
}

	public static void modificarVivienda() {
		
		System.out.println("Has escogido modificar vivienda");
		System.out.println("*************************");
		listadoVivienda();

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
					// v.setSuperficie(Teclado.pideDatoCadena("Introduzca la superficie: "));
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
						+ ", Días de ocupación:  " + c.getDiasOcupado()+ ", Distancia a la playa: "+ c.getDistanciaPlaya() + ", Para la época: " + c.getEpoca()+"]") ;
			}
		
		if (v instanceof Particular) {
			Particular t = (Particular) v;
			System.out.println((++cont) + " Vivienda particular con [nº Catastro: " + t.getNumCatastro() + "," + " Superficie:  "
						+ t.getSuperficie() + "metros cuadrados, nº de aires acondicionados: " + t.getNumAireAcond()
						+ ", nº de baños:  " + t.getNumBaños()+ ", Tipo de casa: "+ t.getTipoCasa()+"]") ;
			}
		
		
		
		}
	}

}



package start;

import hospedaje.Hotel;
import hospedaje.Pension;
import opcionesMenu.OpcionesMenu;
import tipos.TpCAS;
import tipos.TpEPO;
import tipos.TpPAGO;
import unifamiliar.Particular;
import unifamiliar.Vacacional;
import utilidades.Teclado;

public class App {
	
	/**
	 * 
	 * Método principal en el que al mostrar el Menú principal podremos elegir entre las opciones de añadir, modificar, borrar o listar una vivienda.
	 * 
	 */

	public static void main(String[] args) {
		
		controlador.GestionLista.anadir(new Hotel("189AR", TpPAGO.TODO, 3,2,TpEPO.ANUAL));
		controlador.GestionLista.anadir(new Pension("398RH", TpPAGO.TODO, "Buena",2,TpEPO.ANUAL));
		controlador.GestionLista.anadir(new Vacacional("513VT", 2,10, 2,20, TpEPO.VERANO));
		controlador.GestionLista.anadir(new Particular("948SD", 10,1, 2, TpCAS.PISO));
		
		int opcion = 0;

		do {
			mostrarMenu();
			try {
			opcion = Teclado.pideDatoEntero("*  5. Opción Salir:                      *"+ "\n******************************************");
			}
			catch (Exception e) {
		}
			if(opcion <1 || opcion >5) {
				System.out.println("Debe escoger un número del 1 al 5.");
			}else {
			ejecutarOpcion(opcion);
			}
		} while (opcion != 5);
		System.out.println("\nHa salido del programa");
		
	}
	
	/**
	 * 
	 * @param opcion
	 * Método auxiliar al principal que llama a la ejecución de los métodos que van a realizar las acciones anteriores.
	 * 
	 */

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			OpcionesMenu.aniadirVivienda();
			break;
		case 2:
			OpcionesMenu.modificarVivienda();
			break;
		case 3:
			OpcionesMenu.borrarVivienda();
			break;
		case 4:
			OpcionesMenu.listarVivienda();
			break;
		}
	}
	
	/**
	 * 
	 * 
	 * Muestra en pantalla las opciones de añadir, modificar, borrar, listar viviendas y salir del programa.
	 * 
	 */

	private static void mostrarMenu() {
		
		System.out.println("\n              Menu principal");
		System.out.println("******************************************");
		System.out.println("*  1. Añadir nueva vivienda.             *");
		System.out.println("*  2. Modificar una vivienda.            *");
		System.out.println("*  3. Borrar una vivienda.               *");
		System.out.println("*  4. Listar el contenido de viviendas.  *");
	}
	

}

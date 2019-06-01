package start;

import opcionesMenu.OpcionesMenu;
import utilidades.Teclado;

public class App {

	public static void main(String[] args) {

		int opcion = 0;

		do {
			mostrarMenu();
			try {
			opcion = Teclado.pideDatoEntero("5. Opción Salir:");
			}
			catch (Exception e) {
		}
			if(opcion <1 || opcion >5) {
				System.out.println("Debe escoger un número del 1 al 5.");
			}else {
			ejecutarOpcion(opcion);
			}
		} while (opcion != 5);
		System.out.println("Has salido del programa");
		
	}

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

	private static void mostrarMenu() {
		
		System.out.println("\n           Menu principal");
		System.out.println("************************************");
		System.out.println("1. Añadir nueva vivienda.");
		System.out.println("2. Modificar una vivienda.");
		System.out.println("3. Borrar una vivienda.");
		System.out.println("4. Listar el contenido de viviendas.");
	}
	

}

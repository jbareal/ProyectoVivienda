package start;

import opcionesMenu.AniadirVivienda;
import opcionesMenu.BorrarVivienda;
import opcionesMenu.ListarVivienda;
import opcionesMenu.ModificarVivienda;

import utilidades.Teclado;

public class App {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = Teclado.pideDatoEntero("5. Opción Salir:");
			ejecutarOpcion(opcion);
		} while (opcion != 5);
		System.out.println("Ha salido del programa");
	}

	private static void ejecutarOpcion(int opcion){
		switch (opcion) {
		case 1: AniadirVivienda.aniadirVivienda(); break;
		case 2: ModificarVivienda.modificarVivienda(); break;
		case 3: BorrarVivienda.borrarVivienda(); break;
		case 4: ListarVivienda.listarVivienda(); break;
		}
	}
	

	private static void mostrarMenu() {
		
		System.out.println("\n     Menu principal");
		System.out.println("*************************");
		System.out.println("1. Añadir nueva vivienda.");
		System.out.println("2. Modificar una vivienda.");
		System.out.println("3. Borrar una vivienda.");
		System.out.println("4. Listar el contenido de viviendas.");
	}

}


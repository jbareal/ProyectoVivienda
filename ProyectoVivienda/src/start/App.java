package start;

import utilidades.Teclado;

public class App {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = Teclado.pideDatoEntero("5. Opci�n Salir:");
			ejecutarOpcion(opcion);
		} while (opcion != 0);
	}

	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
		case 1: OpcionesMenu.aniadirVivienda(); break;
		case 2: OpcionesMenu.modificarVivienda(); break;
		case 3: OpcionesMenu.borrarVivienda(); break;
		case 4: OpcionesMenu.listarVivienda(); break;
		}
	}
	

	private static void mostrarMenu() {
		
		System.out.println("\n     Menu principal");
		System.out.println("*************************");
		System.out.println("1. A�adir nueva vivienda.");
		System.out.println("2. Modificar una vivienda.");
		System.out.println("3. Borrar una vivienda.");
		System.out.println("4. Listar el contenido de viviendas.");
	}

}


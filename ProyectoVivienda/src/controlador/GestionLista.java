package controlador;

import java.util.ArrayList;

import java.util.List;

import vivienda.Vivienda;

public class GestionLista {

	private static List<Vivienda> lstViviendas = new ArrayList<>();
	
	
	public static void anadir(Vivienda v) {
		lstViviendas.add(v);
	}

	public static void borrar(int pos) {
		lstViviendas.remove(pos);
	}

	public static Integer tamanio() {
		return lstViviendas.size();
	}
	
	public static List<Vivienda> getLista(){
		return lstViviendas;
	}

}

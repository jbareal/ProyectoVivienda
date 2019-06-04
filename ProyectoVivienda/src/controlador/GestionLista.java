package controlador;

import java.util.ArrayList;

import java.util.List;

import vivienda.Vivienda;

public class GestionLista {
	

	private static List<Vivienda> lstViviendas = new ArrayList<>();
	
	
	/**
	 * @param viv
	 * A�ade una vivienda a la lista.
	 * 
	 */
	public static void anadir(Vivienda viv) {
		lstViviendas.add(viv);
	}
	
	/**
	 * @return Integer
	 * Devuelve el tama�o de la lista de viviendas.
	 * 
	 */
	
	public static Integer tamanio() {
		return lstViviendas.size();
	}
	
	/**
	 * @param pos
	 * Borra una vivienda en una posici�n determinada de la lista.
	 * 
	 */
	
   public static void borrar(int pos) {
	   lstViviendas.remove(pos);
	      
   }	
   /**
	 * @return List<Vivienda>
	 * Devuelve la lista de viviendas.
	 * 
	 */
	
  public static List<Vivienda> getLista(){
	  return lstViviendas; 
  }

  /**
	 * @param pos
	 * Devuelve una posici�n determinada de la lista.
	 * 
	 */

public static Vivienda get(int pos) {
	return lstViviendas.get(pos);
}

 
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


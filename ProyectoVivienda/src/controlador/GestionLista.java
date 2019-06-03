package controlador;

import java.util.ArrayList;

import java.util.List;

import vivienda.Vivienda;

public class GestionLista {
	

	private static List<Vivienda> lstViviendas = new ArrayList<>();
	
	
	
	public static void anadir(Vivienda viv) {
		lstViviendas.add(viv);
	}
	

	
	public static Integer tamanio() {
		return lstViviendas.size();
	}
	
	
	
   public static void borrar(int pos) {
	   lstViviendas.remove(pos);
	      
   }	
	
  public static List<Vivienda> getLista(){
	  return lstViviendas; 
  }

  /*
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

*/
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


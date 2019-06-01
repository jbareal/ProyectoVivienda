package controlador;

import java.util.Comparator;

import hospedaje.Hotel;
import hospedaje.Pension;
import unifamiliar.Particular;
import unifamiliar.Vacacional;
import vivienda.Vivienda;

public class Comparador implements Comparator <Vivienda> {
	
	public int compare(Vivienda v1, Vivienda v2) {
		int res = 0;
		int valorV1 = 0;
		int valorV2 = 0;
		
		if(v1 instanceof Hotel)      valorV1=1;
		if(v1 instanceof Pension)    valorV1=2;
		if(v1 instanceof Vacacional) valorV1=3;
		if(v1 instanceof Particular) valorV1=4;

		if(v2 instanceof Hotel)      valorV2=1;
		if(v2 instanceof Pension)    valorV2=2;
		if(v2 instanceof Vacacional) valorV2=3;
		if(v2 instanceof Particular) valorV2=4;
		
		res = valorV1 - valorV2;

		res = (res==0) ? v1.getNumCatastro().compareTo(v2.getNumCatastro()) : res;
		
		return res;
		
	}
	

}

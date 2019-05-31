package utilidades;

import tipos.TpCAS;
import tipos.TpPAGO;

public class ConvertirTipo {

	public static TpPAGO toTpPAGO(Integer num) {
		TpPAGO ret = null;
		switch(num) {
		case 1: ret = TpPAGO.TARJETA; break;
		case 2: ret = TpPAGO.PAYPAL; break;
		case 3: ret = TpPAGO.EFECTIVO; break;
		case 4: ret = TpPAGO.TODO; break;
		}
		return ret;
	}

	public static TpPAGO toTpPAGO(String str) {
		TpPAGO ret = null;
		switch(str.toUpperCase()) {
		case "TARJETA" : ret = TpPAGO.TARJETA; break;
		case "PAYPAL"  : ret = TpPAGO.PAYPAL; break;
		case "EFECTIVO": ret = TpPAGO.EFECTIVO; break;
		case "TODO"    : ret = TpPAGO.TODO; break;
		}
		return ret;
	}
	
	public static TpCAS toTpCAS(String str) {
		TpCAS ret = null;
		switch(str.toUpperCase()) {
		case "ADOSADO" : ret = TpCAS.ADOSADO; break;
		case "PAREADO" : ret = TpCAS.PAREADO; break;
		case "PISO"    : ret = TpCAS.PISO; break;
		
		}
		return ret;
	
}
	
}	
	
	

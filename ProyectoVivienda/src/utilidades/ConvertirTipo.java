package utilidades;

import tipos.TpCAS;
import tipos.TpEPO;
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
	
	public static TpEPO toTpEPO(Integer num) {
		TpEPO ret = null;
		switch(num) {
		case 1: ret = TpEPO.VERANO; break;
		case 2: ret = TpEPO.INVIERNO; break;
		case 3: ret = TpEPO.ANUAL; break;
		}
		return ret;
	}
	
	public static TpEPO toTpEPO(String str) {
		TpEPO ret = null;
		switch(str.toUpperCase()) {
		case "VERANO" : ret = TpEPO.VERANO; break;
		case "INVIERNO" : ret = TpEPO.INVIERNO; break;
		case "ANUAL"    : ret = TpEPO.ANUAL; break;
		
		}
		return ret;
	
}


}	
	
	

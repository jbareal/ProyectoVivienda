package hospedaje;

import interfaces.Informacion;
import tipos.TpEPO;
import tipos.TpPAGO;


public class Pension extends Hospedaje implements Informacion {

	private String opinionViajeros;
	private Integer paxPorHabitacion;
	private TpEPO tipoEPO;

	public Pension() {
	}

	public Pension(String numCatastro, TpPAGO tipoPAGO, String opinionViajeros, Integer paxPorHabitacion, TpEPO tipoEPO) {
		super(numCatastro, tipoPAGO);
		this.opinionViajeros = opinionViajeros;
		this.paxPorHabitacion = paxPorHabitacion;
		this.tipoEPO = tipoEPO;
	}

	public String getOpinionViajeros() {
		return opinionViajeros;
	}

	public void setOpcionViajeros(String opcionViajeros) {
		this.opinionViajeros = opcionViajeros;
	}

	public Integer getPaxPorHabitacion() {
		return paxPorHabitacion;
	}

	public void setPaxPorHabitacion(Integer paxPorHabitacion) {
		this.paxPorHabitacion = paxPorHabitacion;
	}

	@Override
	public Integer getPrecioMedio() {
		return (paxPorHabitacion * 3) + 2;
	}

	@Override
	public String toString() {
		return "Pension [opinionViajeros=" + opinionViajeros + ", paxPorHabitacion=" + paxPorHabitacion + ", tipoEPO="
				+ tipoEPO + ", getOpinionViajeros()=" + getOpinionViajeros()
				+ ", getPaxPorHabitacion()=" + getPaxPorHabitacion() + ", getPrecioMedio()=" + getPrecioMedio()
				+ ", getEpoca()=" + getEpoca() + ", getTipoPAGO()=" + getTipoPAGO() + "]";
	}

	@Override
	public TpEPO getEpoca() {
		
		return tipoEPO;
	}

	@Override
	public void setEpoca(TpEPO tipoEPO) {
		this.tipoEPO = tipoEPO;

	}
 
}

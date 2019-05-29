package hospedaje;

import interfaces.Informacion;
import tipos.TpEPO;
import tipos.TpPAGO;

public class Pension extends Hospedaje implements Informacion {

	private String opcionViajeros;
	private Integer paxPorHabitacion;
	private TpEPO tipoEPO; 
	
	public Pension() {
	}
	public Pension(TpPAGO TipoPAGO, String numCatastro, String opcionViajeros, Integer paxPorHabitacion, TpEPO tipoEPO) {
		super(numCatastro, TipoPAGO);
		this.opcionViajeros = opcionViajeros;
		this.paxPorHabitacion = paxPorHabitacion;
	}
	public String getOpcionViajeros() {
		return opcionViajeros;
	}
	public void setOpcionViajeros(String opcionViajeros) {
		this.opcionViajeros = opcionViajeros;
	}
	public Integer getPaxPorHabitacion() {
		return paxPorHabitacion;
	}
	public void setPaxPorHabitacion(Integer paxPorHabitacion) {
		this.paxPorHabitacion = paxPorHabitacion;
	}
	@Override
	public Integer getPrecioMedio() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Pension [opcionViajeros=" + opcionViajeros + ", paxPorHabitacion=" + paxPorHabitacion
				+ ", getOpcionViajeros()=" + getOpcionViajeros() + ", getPaxPorHabitacion()=" + getPaxPorHabitacion()
				+ ", getPrecioMedio()=" + getPrecioMedio() + "]";
	}
	@Override
	public TpEPO getEpoca() {
		// TODO Auto-generated method stub
		return tipoEPO;
	}
	@Override
	public void setEpoca(TpEPO tipoEPO) {
		this.tipoEPO= tipoEPO;
		
	}
	
	
	
	
	
}

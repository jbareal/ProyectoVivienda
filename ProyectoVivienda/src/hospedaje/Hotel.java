package hospedaje;

import interfaces.Informacion;
import tipos.TpEPO;
import tipos.TpPAGO;

public class Hotel extends Hospedaje implements Informacion {

	private Integer numHabitaciones;
	private Integer numComedores;
	private TpEPO tipoEPO;

	public Hotel() {
	}

	public Hotel(String numCatastro, TpPAGO tipoPAGO, Integer numHabitaciones, Integer numComedores, TpEPO tipoEPO) {
		super(numCatastro, tipoPAGO);
		this.numHabitaciones = numHabitaciones;
		this.numComedores = numComedores;
		this.tipoEPO =tipoEPO;
	}

	public Integer getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Integer numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public Integer getNumComedores() {
		return numComedores;
	}

	public void setNumComedores(Integer numComedores) {
		this.numComedores = numComedores;
	}

	@Override
	public Integer getPrecioMedio() {
		return numHabitaciones + numComedores;

	}

	public TpEPO getTipoEPO() {
		return tipoEPO;
	}

	public void setTipoEPO(TpEPO tipoEPO) {
		this.tipoEPO = tipoEPO;
	}

	@Override
	public String toString() {
		return "Hotel [numHabitaciones=" + numHabitaciones + ", numComedores=" + numComedores + ", tipoEPO=" + tipoEPO
				+ ", getNumHabitaciones()=" + getNumHabitaciones() + ", getNumComedores()="
				+ getNumComedores() + ", getPrecioMedio()=" + getPrecioMedio() + ", getTipoEPO()=" + getTipoEPO()
				+ ", getTipoPAGO()=" + getTipoPAGO() + ", getEpoca()=" + getEpoca() + "]";
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

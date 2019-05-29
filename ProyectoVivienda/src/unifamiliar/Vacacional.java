package unifamiliar;


import interfaces.Informacion;
import tipos.TpEPO;
import unifamiliar.Unifamiliar;

/**
 * @author JUAN
 *
 */

public class Vacacional extends Unifamiliar implements Informacion{
    
	private Integer diasOcupado; 
	private Integer distanciaPlaya;
	private TpEPO tipoEPO; 
	
	public Vacacional() {
		super();
	}
	
	/**
	 * @param numCatastro
	 * @param superficie
	 * @param numAireAcond
	 */
	/**
	 * @param diasOcupado
	 * @param distanciaPlaya
	 */
	
	public Vacacional(String numCatastro, Integer superficie, Integer numAireAcond, Integer diasOcupado, Integer distanaciaPlaya, TpEPO tipoEPO) {
		super(numCatastro, superficie, numAireAcond);
		setDiasOcupado(diasOcupado);
		setDistanciaPlaya(distanciaPlaya);
	}

	public Integer getDiasOcupado() {
		return diasOcupado;
	}

	public void setDiasOcupado(Integer diasOcupado) {
		this.diasOcupado = diasOcupado;
	}

	public Integer getDistanciaPlaya() {
		return distanciaPlaya;
	}

	public void setDistanciaPlaya(Integer distanciaPlaya) {
		this.distanciaPlaya = distanciaPlaya;
	}

	@Override
	public String toString() {
		
		return "Vacacional [ numumeroCatastro= " + getNumCatastro()+ ", superficie=" + getSuperficie() + ", numAireAcond=" + getNumAireAcond() +   ", DiasOcupado =" +getDiasOcupado()+ ", DistanciaPlaya()=" + getDistanciaPlaya()+"]";
		
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

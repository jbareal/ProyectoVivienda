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
	
	public Vacacional(String numCatastro, Integer superficie, Integer numAireAcond, Integer diasOcupado, Integer distanciaPlaya, TpEPO tipoEPO) {
		super(numCatastro, superficie, numAireAcond);
		setDiasOcupado(diasOcupado);
		setDistanciaPlaya(distanciaPlaya);
		this.tipoEPO = tipoEPO; 
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
	
	public TpEPO getTipoEPO() {
		return tipoEPO;
	}

	public void setTipoEPO(TpEPO tipoEPO) {
		this.tipoEPO = tipoEPO;
	}

	public TpEPO getEpoca() {
		// TODO Auto-generated method stub
		return tipoEPO ;
	}

	
	public void setEpoca(TpEPO tipoEPO) {
	  this.tipoEPO = tipoEPO;
	}


	@Override
	public String toString() {
		
		return "Vacacional [ numumeroCatastro= " + getNumCatastro()+ ", superficie=" + getSuperficie() + ", numAireAcond=" + getNumAireAcond() +   ", DiasOcupado =" +getDiasOcupado()+ ", DistanciaPlaya()=" + getDistanciaPlaya()+"]";
		
	}

	
}


	


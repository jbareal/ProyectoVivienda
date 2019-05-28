package unifamiliar;


import unifamiliar.Unifamiliar;

/**
 * @author JUAN
 *
 */

public class Vacacional extends Unifamiliar {
    
	private Integer diasOcupado; 
	private Integer distanciaPlaya;
	
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
	
	public Vacacional(String numCatastro, Integer superficie, Integer numAireAcond, Integer diasOcupado, Integer distanaciaPlaya) {
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
		StringBuilder text = new StringBuilder(super.toString());
		return "Vacacional ["+ text + "getDiasOcupado()= " + getDiasOcupado() + ", getDistanciaPlaya()=" + getDistanciaPlaya()+"]";
				
	}

	
}

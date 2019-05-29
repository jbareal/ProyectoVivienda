package unifamiliar;

/**
 * 
 */


import vivienda.Vivienda;

/**
 * @author JUAN
 *
 */
public class Unifamiliar extends Vivienda {
	private Integer superficie;
	private Integer numAireAcond; 

	/**
	 * 
	 */
	public Unifamiliar() {
		super();
	}

	/**
	 * @param numCatastro
	 */
	public Unifamiliar(String numCatastro, Integer superficie, Integer numAireAcond) {
		super(numCatastro);
		setSuperficie(superficie);
		setNumAireAcond(numAireAcond);
	}

	public Integer getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	public Integer getNumAireAcond() {
		return numAireAcond;
	}

	public void setNumAireAcond(Integer numAireAcond) {
		this.numAireAcond = numAireAcond;
	} 

	
	@Override
	public String toString() {
		StringBuilder text = new StringBuilder(super.toString());
		return "Unifamiliar [" + text + ", superficie=" + getSuperficie() + ", numAireAcond=" + getNumAireAcond() +   "]";
	}


	


}

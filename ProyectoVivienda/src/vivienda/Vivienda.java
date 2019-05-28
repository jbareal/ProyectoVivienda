package vivienda;

/**
 * @author JUAN
 *
 */

public class Vivienda {
	private String numCatastro;

	/**
	 * 
	 */
	public Vivienda() {
	}

	/**
	 * @param numCatastro
	 */
	public Vivienda(String numCatastro) {
		this.numCatastro = numCatastro;
	}

	public String getNumCatastro() {
		return numCatastro;
	}

	public void setNumCatastro(String numCatastro) {
		this.numCatastro = numCatastro;
	}


	@Override
	public String toString() {
		return "Vivienda [numCatastro=" + getNumCatastro() + "]";
	}	
	

}

package unifamiliar;

/**
 * 
 */


import tipos.TpCAS;
import unifamiliar.Unifamiliar;

/**
 * @author JUAN
 *
 */
public class Particular extends Unifamiliar {
	private Integer numBa�os; 
    private TpCAS tipoCasa; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBa�os, TpCAS tipoCasa) {
			super(numCatastro, superficie, numAireAcond);
			setNumBa�os(numBa�os);
			setTipoCasa(tipoCasa);
			
		}

		public Integer getNumBa�os() {
			return numBa�os;
		}

		public void setNumBa�os(Integer numBa�os) {
			this.numBa�os = numBa�os;
		}

		public TpCAS getTipoCasa() {
			return tipoCasa;
		}

		public void setTipoCasa(TpCAS tipoCasa) {
			this.tipoCasa = tipoCasa;
		}

		@Override
		public String toString() {
			
			return "Unifamiliar [ numumeroCatastro= " + getNumCatastro()+ ", superficie=" + getSuperficie() + ", numAireAcond=" + getNumAireAcond() + 
					
			 ",  numBa�os=" + getNumBa�os()+ ", tipoCasa=" + getTipoCasa() + "]";
		}
	
}

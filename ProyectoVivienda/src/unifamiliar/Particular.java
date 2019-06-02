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
	private Integer numBaños; 
    private TpCAS tipoCASA; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBaños, TpCAS tipoCASA) {
			super(numCatastro, superficie, numAireAcond);
			this.numBaños = numBaños;
			this.tipoCASA = tipoCASA;
			
			
		}

		public Integer getNumBaños() {
			return numBaños;
		}

		public void setNumBaños(Integer numBaños) {
			this.numBaños = numBaños;
		}

		public TpCAS getTipoCASA() {
			return tipoCASA;
		}

		public void setTipoCASA(TpCAS tipoCASA) {
			this.tipoCASA = tipoCASA;
		}

		@Override
		public String toString() {
			
			return "Unifamiliar [ numumeroCatastro= " + getNumCatastro()+ ", superficie=" + getSuperficie() + ", numAireAcond=" + getNumAireAcond() + 
					
			 ",  numBaños=" + getNumBaños()+ ", tipoCasa=" + getTipoCASA() + "]";
		}
	
}

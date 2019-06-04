package unifamiliar;

/**
 * 
 */


import tipos.TpCAS;
import unifamiliar.Unifamiliar;


public class Particular extends Unifamiliar {
	private Integer numBanos; 
    private TpCAS tipoCASA; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 * @param numBanos
		 * @param tipoCASA
		 * 
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBanos, TpCAS tipoCASA) {
			super(numCatastro, superficie, numAireAcond);
			this.numBanos = numBanos;
			this.tipoCASA = tipoCASA;
			
			
		}

		public Integer getNumBanos() {
			return numBanos;
		}

		public void setNumBanos(Integer numBanos) {
			this.numBanos = numBanos;
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
					
			 ",  numBa�os=" + getNumBanos()+ ", tipoCasa=" + getTipoCASA() + "]";
		}
	
}

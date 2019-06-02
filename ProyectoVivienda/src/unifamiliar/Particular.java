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
    private TpCAS tipoCASA; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBa�os, TpCAS tipoCASA) {
			super(numCatastro, superficie, numAireAcond);
			this.numBa�os = numBa�os;
			this.tipoCASA = tipoCASA;
			
			
		}

		public Integer getNumBa�os() {
			return numBa�os;
		}

		public void setNumBa�os(Integer numBa�os) {
			this.numBa�os = numBa�os;
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
					
			 ",  numBa�os=" + getNumBa�os()+ ", tipoCasa=" + getTipoCASA() + "]";
		}
	
}

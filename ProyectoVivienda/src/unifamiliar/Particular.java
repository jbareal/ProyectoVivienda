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
	private Integer numBanios; 
        private TpCAS tipoCASA; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBanios, TpCAS tipoCASA) {
			super(numCatastro, superficie, numAireAcond);
			this.numBanios = numBanios;
			this.tipoCASA = tipoCASA;
			
			
		}

		public Integer getNumBanios() {
			return numBanios;
		}

		public void setNumBanios(Integer numBanios) {
			this.numBanios = numBanios;
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
					
			 ",  numBaños=" + getNumBanios()+ ", tipoCasa=" + getTipoCASA() + "]";
		}
	
}

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
    private TpCAS tipoCasa; 
    
		public Particular() {
		super();
	}

		/**
		 * @param numCatastro
		 * @param superficie
		 * @param numAireAcond
		 */
		public Particular(String numCatastro, Integer superficie, Integer numAireAcond, Integer numBaños, TpCAS tipoCasa) {
			super(numCatastro, superficie, numAireAcond);
			setNumBaños(numBaños);
			setTipoCasa(tipoCasa);
			
		}

		public Integer getNumBaños() {
			return numBaños;
		}

		public void setNumBaños(Integer numBaños) {
			this.numBaños = numBaños;
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
					
			 ",  numBaños=" + getNumBaños()+ ", tipoCasa=" + getTipoCasa() + "]";
		}
	
}

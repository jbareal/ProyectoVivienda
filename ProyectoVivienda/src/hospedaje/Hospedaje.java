package hospedaje;

import tipos.TpPAGO;
import vivienda.Vivienda;

public abstract class Hospedaje extends Vivienda {

	private TpPAGO TipoPAGO;

	public Hospedaje() {
	}

	public Hospedaje(String numCatastro, TpPAGO tipoPAGO) {
		super(numCatastro);
		this.TipoPAGO = tipoPAGO;
	}

	public TpPAGO getTipoPAGO() {
		return TipoPAGO;
	}

	public void setTipoPAGO(TpPAGO tipoPAGO) {
		this.TipoPAGO = tipoPAGO;
	}

	public abstract Integer getPrecioMedio();

	@Override
	public String toString() {
		return "Hospedaje [ getTipoPAGO()=" + getTipoPAGO() + ", getPrecioMedio()=" + getPrecioMedio() + "]";
	}

}

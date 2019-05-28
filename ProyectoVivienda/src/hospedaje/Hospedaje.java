package hospedaje;

import tipos.TpPAGO;

public class Hospedaje {
	
	private TpPAGO TipoPAGO;

	public Hospedaje() {
	}

	public Hospedaje(TpPAGO tipoPAGO) {
		this.TipoPAGO = tipoPAGO;
	}

	public TpPAGO getTipoPAGO() {
		return TipoPAGO;
	}

	public void setTipoPAGO(TpPAGO tipoPAGO) {
		TipoPAGO = tipoPAGO;
	}
	@Override
	public String toString() {
		return "Hospedaje [TipoPAGO=" + TipoPAGO + ", getTipoPAGO()=" + getTipoPAGO() + "]";

	}
	
}



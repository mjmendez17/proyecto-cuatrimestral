package datos;

import java.util.List;

public class Estadio {
	
	private long idEstadio;
	
	private List<Butaca> listaButacas;

	public long getIdEstadio() {
		return idEstadio;
	}

	public void setIdEstadio(long idEstadio) {
		this.idEstadio = idEstadio;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}

}

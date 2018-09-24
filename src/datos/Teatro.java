package datos;

import java.util.List;

public class Teatro {
	
	private long idTeatro;
	
	private List<Butaca> listaButacas;

	public long getIdTeatro() {
		return idTeatro;
	}

	public void setIdTeatro(long idTeatro) {
		this.idTeatro = idTeatro;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}
}

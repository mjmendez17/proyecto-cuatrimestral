package datos;

import java.util.List;

public class Teatro {
	
	private int idTeatro;
	
	private List<Butaca> listaButacas;

	public int getIdTeatro() {
		return idTeatro;
	}

	public void setIdTeatro(int idTeatro) {
		this.idTeatro = idTeatro;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}
}

package datos;

import java.util.List;

public class Evento {
	
	private long idEvento;
	
	private String descripcion;
	
	private double precioBase;
	
	private String tipoEvento;
	
	private List<Funcion> listaFunciones;

	public long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public List<Funcion> getListaFunciones() {
		return listaFunciones;
	}

	public void setListaFunciones(List<Funcion> listaFunciones) {
		this.listaFunciones = listaFunciones;
	}

}

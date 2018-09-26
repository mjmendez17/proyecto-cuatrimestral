package datos;

import java.util.*;

public class Funcion {

	private long idFuncion;

	private String descripcion;

	private GregorianCalendar fechaHora;

	private Evento evento;

	private List<Descuento> listaDescuentos;

	public Funcion() {
	}

	public Funcion(String descripcion, GregorianCalendar fechaHora, Evento evento) {
		super();
		this.descripcion = descripcion;
		this.fechaHora = fechaHora;
		this.evento = evento;
	}

	public long getIdFuncion() {
		return idFuncion;
	}

	protected void setIdFuncion(long idFuncion) {
		this.idFuncion = idFuncion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Descuento> getListaDescuentos() {
		return listaDescuentos;
	}

	public void setListaDescuentos(List<Descuento> listaDescuentos) {
		this.listaDescuentos = listaDescuentos;
	}

	@Override
	public String toString() {
		return "Funcion [idFuncion=" + idFuncion + ", descripcion=" + descripcion + ", fechaHora=" + fechaHora
				+ ", evento=" + evento + "]";
	}

}

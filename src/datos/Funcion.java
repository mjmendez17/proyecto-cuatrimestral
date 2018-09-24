package datos;

import java.util.Calendar;

public class Funcion {

	private long idFuncion;
	
	private String descripcion;
	
	private Calendar fecha;
	
	private Calendar horaInicio;
	
	private Evento evento;

	public long getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(long idFuncion) {
		this.idFuncion = idFuncion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Calendar getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
}

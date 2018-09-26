package datos;

import java.util.List;

public class Evento {

	private long idEvento;

	private String descripcion;

	private float precioBase;

	private String tipoEvento;

	private List<Funcion> listaFunciones;

	private Auditorio auditorio;

	public Evento(String descripcion, float precioBase, String tipoEvento, Auditorio auditorio) {
		super();
		this.descripcion = descripcion;
		this.precioBase = precioBase;
		this.tipoEvento = tipoEvento;
		this.auditorio = auditorio;
	}

	public Evento() {
	}

	public long getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
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

	public Auditorio getAuditorio() {
		return auditorio;
	}

	public void setAuditorio(Auditorio auditorio) {
		this.auditorio = auditorio;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", descripcion=" + descripcion + ", precioBase=" + precioBase
				+ ", tipoEvento=" + tipoEvento + ", listaFunciones=" + listaFunciones + ", auditorio=" + auditorio
				+ "]";
	}

}

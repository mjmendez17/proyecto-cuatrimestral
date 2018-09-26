package datos;

import java.util.List;

public class Auditorio {

	private long idAuditorio;

	private String tipoAuditorio;

	private String descripcion;

	private List<Sector> listaSectores;

	private List<Evento> listaEventos;

	public Auditorio() {
	}

	public Auditorio(String tipoAuditorio, String descripcion) {
		super();
		this.tipoAuditorio = tipoAuditorio;
		this.descripcion = descripcion;

	}

	public long getIdAuditorio() {
		return idAuditorio;
	}

	protected void setIdAuditorio(long idAuditorio) {
		this.idAuditorio = idAuditorio;
	}

	public String getTipoAuditorio() {
		return tipoAuditorio;
	}

	public void setTipoAuditorio(String tipoAuditorio) {
		this.tipoAuditorio = tipoAuditorio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Sector> getListaSectores() {
		return listaSectores;
	}

	public void setListaSectores(List<Sector> listaSectores) {
		this.listaSectores = listaSectores;
	}

	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}

	@Override
	public String toString() {
		return "Auditorio [idAuditorio=" + idAuditorio + ", tipoAuditorio=" + tipoAuditorio + ", descripcion="
				+ descripcion + ", listaSectores=" + listaSectores + ", listaEventos=" + listaEventos + "]";
	}

}

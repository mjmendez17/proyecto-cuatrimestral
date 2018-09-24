package datos;

import java.util.List;

public class Auditorio {
	
	private long idAuditorio;
	
	private String descripcion;
	
	private List<Sector> listaSectores;
	
	private Evento evento;

	public long getIdAuditorio() {
		return idAuditorio;
	}

	public void setIdAuditorio(long idAuditorio) {
		this.idAuditorio = idAuditorio;
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

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}

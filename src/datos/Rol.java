package datos;

public class Rol {
	private long idRol;
	private String nombreRol;

	public Rol() {

	}

	public Rol(String nombreRol) {
		super();

		this.nombreRol = nombreRol;
	}

	public long getIdRol() {
		return idRol;
	}

	protected void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nombreRol=" + nombreRol + "]";
	}

}

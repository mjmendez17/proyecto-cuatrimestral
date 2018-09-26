package datos;

public class Rol {

	private long idRol;
	private String nombre;
	private String privilegio;

	public Rol() {

	}

	public Rol(String nombre, String privilegio) {
		super();
		this.nombre = nombre;
		this.privilegio = privilegio;
	}

	public long getIdRol() {
		return idRol;
	}

	protected void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nombre=" + nombre + ", privilegio=" + privilegio + "]";
	}

}

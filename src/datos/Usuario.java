package datos;

public class Usuario {
	private long idUsuario;
	private Rol rol;
	private String nombreUsuario;
	private String clave;

	public Usuario() {

	}

	public Usuario(Rol rol, String nombreUsuario, String clave) {
		super();
		this.rol = rol;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	protected void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", rol=" + rol + ", nombreUsuario=" + nombreUsuario + ", clave="
				+ clave + "]";
	}

}

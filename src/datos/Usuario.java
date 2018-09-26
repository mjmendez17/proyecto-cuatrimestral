package datos;

public class Usuario {
	private long idUsuario;
	private Rol rol;
	private String nombreUsuario;
	private String password;

	public Usuario() {

	}

	public Usuario(Rol rol, String nombreUsuario, String password) {
		super();
		this.rol = rol;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", rol=" + rol + ", nombreUsuario=" + nombreUsuario + ", password="
				+ password + "]";
	}

}

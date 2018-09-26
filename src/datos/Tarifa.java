package datos;

public class Tarifa {

	private long idTarifa;
	private Funcion funcion;
	private String descripcion;

	public Tarifa() {
	}

	public Tarifa(Funcion funcion, String descripcion) {
		super();
		this.funcion = funcion;
		this.descripcion = descripcion;
	}

	public long getIdTarifa() {
		return idTarifa;
	}

	protected void setIdTarifa(long idTarifa) {
		this.idTarifa = idTarifa;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Tarifa [idTarifa=" + idTarifa + ", funcion=" + funcion + ", descripcion=" + descripcion + "]";
	}

}

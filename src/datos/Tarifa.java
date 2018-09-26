package datos;

public class Tarifa {
	
	private int idTarifa;
	private Funcion funcion;
	private String descripcion;
	
	public Tarifa(Funcion funcion, String descripcion) {
		super();
		this.funcion = funcion;
		this.descripcion = descripcion;
	}

	public int getIdTarifa() {
		return idTarifa;
	}

	protected void setIdTarifa(int idTarifa) {
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

package datos;

import java.util.*;

public class Descuento {

	private long idDescuento;
	private String codigoDescuento;
	private String descripcion;

	public Descuento() {
	}

	public Descuento(String codigoDescuento, String descripcion) {
		super();
		this.codigoDescuento = codigoDescuento;
		this.descripcion = descripcion;
	}

	public long getIdDescuento() {
		return idDescuento;
	}

	protected void setIdDescuento(long idDescuento) {
		this.idDescuento = idDescuento;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Descuento [idDescuento=" + idDescuento + ", codigoDescuento=" + codigoDescuento + ", descripcion="
				+ descripcion + "]";
	}

}

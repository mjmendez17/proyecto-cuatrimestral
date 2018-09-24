package datos;

import java.util.*;

public class TipoCliente {

	private int idTipoCliente;
	private String tipoCliente;
	private Descuento descuento;

	public TipoCliente() {
	}

	public TipoCliente(String tipoCliente, Descuento descuento) {
		super();

		this.tipoCliente = tipoCliente;
		this.descuento = descuento;
	}

	public int getIdTipoCliente() {
		return idTipoCliente;
	}

	protected void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "TipoCliente [idTipoCliente=" + idTipoCliente + ", tipoCliente=" + tipoCliente + "]";
	}

}

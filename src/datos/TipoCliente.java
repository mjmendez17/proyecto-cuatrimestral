package datos;

import java.util.*;

public class TipoCliente {

	private long idTipoCliente;
	private String tipoCliente;
	private String codigoDescuento;

	public TipoCliente() {
	}

	public TipoCliente(String tipoCliente, String codigoDescuento) {
		super();
		this.tipoCliente = tipoCliente;
		this.codigoDescuento = codigoDescuento;
	}

	public long getIdTipoCliente() {
		return idTipoCliente;
	}

	protected void setIdTipoCliente(long idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "TipoCliente [idTipoCliente=" + idTipoCliente + ", tipoCliente=" + tipoCliente + ", codigoDescuento="
				+ codigoDescuento + "]";
	}

}

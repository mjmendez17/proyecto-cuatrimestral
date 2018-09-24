package datos;

import java.util.*;

public class Descuento {

	private int idDescuento;
	private boolean valido;

	public Descuento() {
	}

	public Descuento(boolean valido) {
		super();

		this.valido = valido;
	}

	public int getIdDescuento() {
		return idDescuento;
	}

	protected void setIdDescuento(int idDescuento) {
		this.idDescuento = idDescuento;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	@Override
	public String toString() {
		return "Descuento [idDescuento=" + idDescuento + ", valido=" + valido + "]";
	}

}

package datos;

import java.util.*;

public class Reserva {

	private int idReserva;
	private String codigoReserva;
	private Funcion funcion;
	private Cliente cliente;
	private Butaca butaca;
	private Usuario usuario;
	private Set<Descuento> descuentos;

	public Reserva() {
	}

	public Reserva(String codigoReserva, Funcion funcion, Cliente cliente, Butaca butaca, Usuario usuario) {
		super();
		this.codigoReserva = codigoReserva;
		this.funcion = funcion;
		this.cliente = cliente;
		this.butaca = butaca;
		this.usuario = usuario;

	}

	public int getIdReserva() {
		return idReserva;
	}

	protected void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Descuento> getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(Set<Descuento> descuentos) {
		this.descuentos = descuentos;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", codigoReserva=" + codigoReserva + ", cliente=" + cliente + "]";
	}

}

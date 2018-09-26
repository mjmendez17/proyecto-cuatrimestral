package datos;

import java.util.*;

public class Reserva {

	private int idReserva;
	private String codigoReserva;
	private float precio;
	private Funcion funcion;
	private Cliente cliente;
	private Usuario usuario;
	private GregorianCalendar fechaHora;
	private Set<Butaca> listaButacas;
	private Set<Sector> listaSectores;

	public Reserva() {
	}

	public Reserva(String codigoReserva, float precio, Funcion funcion, Cliente cliente, Usuario usuario,
			GregorianCalendar fechaHora) {
		super();
		this.codigoReserva = codigoReserva;
		this.precio = precio;
		this.funcion = funcion;
		this.cliente = cliente;
		this.usuario = usuario;
		this.fechaHora = fechaHora;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Set<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(Set<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}

	public Set<Sector> getListaSectores() {
		return listaSectores;
	}

	public void setListaSectores(Set<Sector> listaSectores) {
		this.listaSectores = listaSectores;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", codigoReserva=" + codigoReserva + ", precio=" + precio
				+ ", funcion=" + funcion + ", cliente=" + cliente + ", usuario=" + usuario + ", fechaHora=" + fechaHora
				+ ", listaButacas=" + listaButacas + ", listaSectores=" + listaSectores + "]";
	}

}

package datos;

import java.util.List;

public class Sector {

	private long idSector;
	
	private String nombreSector;
	 
	private double precioAdicional;
	
	private long cantidadMaxima;
	
	private List<Butaca> listaButacas;

	public long getIdSector() {
		return idSector;
	}

	public void setIdSector(long idSector) {
		this.idSector = idSector;
	}

	public String getNombreSector() {
		return nombreSector;
	}

	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	public double getPrecioAdicional() {
		return precioAdicional;
	}

	public void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}

	public long getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(long cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}
}

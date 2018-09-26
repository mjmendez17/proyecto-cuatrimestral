package datos;

import java.util.List;

public class Sector {

	private long idSector;

	private String nombreSector;

	private float precioAdicional;

	private int cantidadMaxima;

	private List<Butaca> listaButacas;

	public Sector(String nombreSector, float precioAdicional, int cantidadMaxima) {
		super();
		this.nombreSector = nombreSector;
		this.precioAdicional = precioAdicional;
		this.cantidadMaxima = cantidadMaxima;

	}

	public Sector() {
	}

	public long getIdSector() {
		return idSector;
	}

	protected void setIdSector(long idSector) {
		this.idSector = idSector;
	}

	public String getNombreSector() {
		return nombreSector;
	}

	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	public float getPrecioAdicional() {
		return precioAdicional;
	}

	public void setPrecioAdicional(float precioAdicional) {
		this.precioAdicional = precioAdicional;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}

	@Override
	public String toString() {
		return "Sector [idSector=" + idSector + ", nombreSector=" + nombreSector + ", precioAdicional="
				+ precioAdicional + ", cantidadMaxima=" + cantidadMaxima + ", listaButacas=" + listaButacas + "]";
	}

}

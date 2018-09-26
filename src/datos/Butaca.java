package datos;

public class Butaca {

	private long idButaca;
	private Boolean estado;
	private int fila;
	private int columna;
	private Sector sector;

	public Butaca() {
	}

	public Butaca(Boolean estado, int fila, int columna, Sector sector) {
		super();
		this.estado = estado;
		this.fila = fila;
		this.columna = columna;
		this.sector = sector;
	}

	public long getIdButaca() {
		return idButaca;
	}

	protected void setIdButaca(long idButaca) {
		this.idButaca = idButaca;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Butaca [idButaca=" + idButaca + ", estado=" + estado + ", fila=" + fila + ", columna=" + columna
				+ ", sector=" + sector + "]";
	}

}

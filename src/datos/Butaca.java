package datos;

public class Butaca {
	
	private int idButaca;
	
	private Boolean estado;
	
	private String tipo;
	
	private String numeroButaca;
	
	private Sector sector;

	public int getIdButaca() {
		return idButaca;
	}

	public void setIdButaca(int idButaca) {
		this.idButaca = idButaca;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumeroButaca() {
		return numeroButaca;
	}

	public void setNumeroButaca(String numeroButaca) {
		this.numeroButaca = numeroButaca;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

}

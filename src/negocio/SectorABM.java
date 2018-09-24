package negocio;

import java.util.List;

import dao.SectorDao;
import datos.Sector;

public class SectorABM {

	SectorDao dao = new SectorDao();

	public Sector traerSector(long idSector) throws Exception {
		Sector c = dao.traerSector(idSector);
		if (dao.traerSector(idSector) == null)
			throw new Exception("Id incorrecto: la Sector no existe");
		return c;
	}

	public int agregar(Sector sector) {
		return dao.agregar(sector);

	}

	public void modificar(Sector c) throws Exception {
		if ((dao.traerSector(c.getIdSector()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idSector) throws Exception {
		Sector c = dao.traerSector(idSector);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Sector no existe para eliminar");
	}

	public List<Sector> traerSector() throws Exception {
		if (dao.traerSector() != null) {
			return dao.traerSector();
		} else
			throw new Exception("No hay Sectors en la base de datos");
	}

	public Sector traerSector(int idSector) throws Exception {
		Sector c = dao.traerSector(idSector);
		if (dao.traerSector(idSector) == null)
			throw new Exception("Id incorrecto: la Sector no existe");
		return c;
	}
}

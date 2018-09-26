package negocio;

import java.util.List;

import dao.TarifaDao;
import datos.Tarifa;

public class TarifaABM {

	TarifaDao dao = new TarifaDao();

	public Tarifa traerTarifa(long idTarifa) throws Exception {
		Tarifa c = dao.traerTarifa(idTarifa);
		if (dao.traerTarifa(idTarifa) == null)
			throw new Exception("Id incorrecto: la Tarifa no existe");
		return c;
	}

	public int agregar(Tarifa Tarifa) {
		return dao.agregar(Tarifa);

	}

	public void modificar(Tarifa c) throws Exception {
		if ((dao.traerTarifa(c.getIdTarifa()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idTarifa) throws Exception {
		Tarifa c = dao.traerTarifa(idTarifa);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Tarifa no existe para eliminar");
	}

	public List<Tarifa> traerTarifa() throws Exception {
		if (dao.traerTarifa() != null) {
			return dao.traerTarifa();
		} else
			throw new Exception("No hay Tarifas en la base de datos");
	}

}

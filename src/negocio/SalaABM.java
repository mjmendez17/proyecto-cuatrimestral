package negocio;

import java.util.List;

import dao.SalaDao;
import datos.Sala;

public class SalaABM {

	SalaDao dao = new SalaDao();

	public Sala traerSala(long idSala) throws Exception {
		Sala c = dao.traerSala(idSala);
		if (dao.traerSala(idSala) == null)
			throw new Exception("Id incorrecto: la Sala no existe");
		return c;
	}

	public int agregar(Sala sala) {
		return dao.agregar(sala);

	}

	public void modificar(Sala c) throws Exception {
		if ((dao.traerSala(c.getIdSala()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idSala) throws Exception {
		Sala c = dao.traerSala(idSala);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Sala no existe para eliminar");
	}

	public List<Sala> traerSala() throws Exception {
		if (dao.traerSala() != null) {
			return dao.traerSala();
		} else
			throw new Exception("No hay Salas en la base de datos");
	}

	public Sala traerSala(int idSala) throws Exception {
		Sala c = dao.traerSala(idSala);
		if (dao.traerSala(idSala) == null)
			throw new Exception("Id incorrecto: la Sala no existe");
		return c;
	}
}

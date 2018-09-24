package negocio;

import java.util.List;

import dao.TeatroDao;
import datos.Teatro;

public class TeatroABM {

	TeatroDao dao = new TeatroDao();

	public Teatro traerTeatro(long idTeatro) throws Exception {
		Teatro c = dao.traerTeatro(idTeatro);
		if (dao.traerTeatro(idTeatro) == null)
			throw new Exception("Id incorrecto: la Teatro no existe");
		return c;
	}

	public int agregar(Teatro teatro) {
		return dao.agregar(teatro);

	}

	public void modificar(Teatro c) throws Exception {
		if ((dao.traerTeatro(c.getIdTeatro()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idTeatro) throws Exception {
		Teatro c = dao.traerTeatro(idTeatro);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Teatro no existe para eliminar");
	}

	public List<Teatro> traerTeatro() throws Exception {
		if (dao.traerTeatro() != null) {
			return dao.traerTeatro();
		} else
			throw new Exception("No hay Teatros en la base de datos");
	}

	public Teatro traerTeatro(int idTeatro) throws Exception {
		Teatro c = dao.traerTeatro(idTeatro);
		if (dao.traerTeatro(idTeatro) == null)
			throw new Exception("Id incorrecto: la Teatro no existe");
		return c;
	}
}

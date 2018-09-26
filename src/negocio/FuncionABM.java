package negocio;

import java.util.List;

import dao.FuncionDao;
import datos.Funcion;
import datos.Funcion;

public class FuncionABM {

	private FuncionDao dao;

	public Funcion traerFuncion(long idFuncion) throws Exception {
		Funcion f = dao.traerFuncion(idFuncion);
		if (f == null)
			throw new Exception("La Funcion no Existe");
		return dao.traerFuncion(idFuncion);
	}

	public int agregar(Funcion Funcion) {
		return dao.agregar(Funcion);

	}

	public void modificar(Funcion c) throws Exception {
		if ((dao.traerFuncion(c.getIdFuncion()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idFuncion) throws Exception {
		Funcion c = dao.traerFuncion(idFuncion);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Funcion no existe para eliminar");
	}

	public List<Funcion> traerFuncion() throws Exception {
		if (dao.traerFuncion() != null) {
			return dao.traerFuncion();
		} else
			throw new Exception("No hay Funciones en la base de datos");
	}

}

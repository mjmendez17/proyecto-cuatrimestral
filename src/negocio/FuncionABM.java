package negocio;

import java.util.List;

import dao.FuncionDao;
import datos.Funcion;

public class FuncionABM {

	FuncionDao dao = new FuncionDao();

	public Funcion traerFuncion(long idFuncion) throws Exception {
		Funcion c = dao.traerFuncion(idFuncion);
		if (dao.traerFuncion(idFuncion) == null)
			throw new Exception("Id incorrecto: la Funcion no existe");
		return c;
	}

	public int agregar(Funcion funcion) {
		return dao.agregar(funcion);

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
			throw new Exception("No hay Funcions en la base de datos");
	}

	public Funcion traerFuncion(int idFuncion) throws Exception {
		Funcion c = dao.traerFuncion(idFuncion);
		if (dao.traerFuncion(idFuncion) == null)
			throw new Exception("Id incorrecto: la Funcion no existe");
		return c;
	}
}

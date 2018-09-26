package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.RolDao;

import datos.Rol;

public class RolABM {

	private RolDao dao;

	public Rol traerRol(long idRol) throws Exception {
		Rol r = dao.traerRol(idRol);
		if (r == null)
			throw new Exception("El Rol no Existe");
		return dao.traerRol(idRol);
	}

	public int agregar(String nombre, String privilegio) {

		Rol c = new Rol(nombre, privilegio);
		return dao.agregar(c);
	}

	public void modificar(Rol c) {

		dao.actualizar(c);
	}

	public void eliminar(long idRol) {

		Rol c = dao.traerRol(idRol);

		dao.eliminar(c);
	}

}

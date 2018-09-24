package negocio;

import java.util.List;

import dao.EstadioDao;
import datos.Estadio;

public class EstadioABM {
	
	EstadioDao dao = new EstadioDao();

	public Estadio traerEstadio(long idEstadio) throws Exception {
		Estadio c = dao.traerEstadio(idEstadio);
		if (dao.traerEstadio(idEstadio) == null)
			throw new Exception("Id incorrecto: la Estadio no existe");
		return c;
	}

	public int agregar(Estadio estadio) {
		return dao.agregar(estadio);

	}

	public void modificar(Estadio c) throws Exception {
		if ((dao.traerEstadio(c.getIdEstadio()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idEstadio) throws Exception {
		Estadio c = dao.traerEstadio(idEstadio);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Estadio no existe para eliminar");
	}

	public List<Estadio> traerEstadio() throws Exception {
		if (dao.traerEstadio() != null) {
			return dao.traerEstadio();
		} else
			throw new Exception("No hay Estadios en la base de datos");
	}

	public Estadio traerEstadio(int idEstadio) throws Exception {
		Estadio c = dao.traerEstadio(idEstadio);
		if (dao.traerEstadio(idEstadio) == null)
			throw new Exception("Id incorrecto: la Estadio no existe");
		return c;
	}

}

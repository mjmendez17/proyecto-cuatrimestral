package negocio;

import java.util.List;

import dao.ButacaDao;
import datos.Butaca;

public class ButacaABM {

	ButacaDao dao = new ButacaDao();

	public Butaca traerButaca(long idButaca) throws Exception {
		Butaca c = dao.traerButaca(idButaca);
		if (dao.traerButaca(idButaca) == null)
			throw new Exception("Id incorrecto: la Butaca no existe");
		return c;
	}

	public int agregar(Butaca butaca) {
		return dao.agregar(butaca);

	}

	public void modificar(Butaca c) throws Exception {
		if ((dao.traerButaca(c.getIdButaca()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idButaca) throws Exception {
		Butaca c = dao.traerButaca(idButaca);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Butaca no existe para eliminar");
	}

	public List<Butaca> traerButaca() throws Exception {
		if (dao.traerButaca() != null) {
			return dao.traerButaca();
		} else
			throw new Exception("No hay Butacas en la base de datos");
	}

	public Butaca traerButaca(int idButaca) throws Exception {
		Butaca c = dao.traerButaca(idButaca);
		if (dao.traerButaca(idButaca) == null)
			throw new Exception("Id incorrecto: la Butaca no existe");
		return c;
	}
}

package negocio;

import java.util.List;

import dao.DescuentoDao;
import datos.Descuento;

public class DescuentoABM {

	DescuentoDao dao = new DescuentoDao();

	public Descuento traerDescuento(long idDescuento) throws Exception {
		Descuento c = dao.traerDescuento(idDescuento);
		if (dao.traerDescuento(idDescuento) == null)
			throw new Exception("Id incorrecto: la Descuento no existe");
		return c;
	}

	public int agregar(Descuento Descuento) {
		return dao.agregar(Descuento);

	}

	public void modificar(Descuento c) throws Exception {
		if ((dao.traerDescuento(c.getIdDescuento()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idDescuento) throws Exception {
		Descuento c = dao.traerDescuento(idDescuento);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Descuento no existe para eliminar");
	}

	public List<Descuento> traerDescuento() throws Exception {
		if (dao.traerDescuentos() != null) {
			return dao.traerDescuentos();
		} else
			throw new Exception("No hay Descuentos en la base de datos");
	}

}

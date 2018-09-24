package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.DescuentoDao;
import datos.Descuento;

public class DescuentoABM {

	DescuentoDao dao = new DescuentoDao();

	public Descuento traerDescuento(int idDescuento) {

		Descuento c = dao.traerDescuento(idDescuento);

		return c;
	}

	public int agregar(boolean valido) {

		Descuento c = new Descuento(valido);
		return dao.agregar(c);
	}

	public void modificar(Descuento c) {

		dao.actualizar(c);
	}

	public void eliminar(int idDescuento) {

		Descuento c = dao.traerDescuento(idDescuento);

		dao.eliminar(c);
	}

	public List<Descuento> traerDescuentos() {
		return dao.traerDescuentos();
	}

}

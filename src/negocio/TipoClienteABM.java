package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.TipoClienteDao;
import datos.Descuento;
import datos.TipoCliente;

public class TipoClienteABM {

	TipoClienteDao dao = new TipoClienteDao();

	public TipoCliente traerTipoCliente(int idTipoCliente) {
		TipoCliente c = dao.traerTipoCliente(idTipoCliente);

		return c;
	}

	public int agregar(String tipoCliente, Descuento descuento) {

		TipoCliente c = new TipoCliente(tipoCliente, descuento);
		return dao.agregar(c);
	}

	public void modificar(TipoCliente c) {

		dao.actualizar(c);
	}

	public void eliminar(int idTipoCliente) {

		TipoCliente c = dao.traerTipoCliente(idTipoCliente);

		dao.eliminar(c);
	}

	public List<TipoCliente> traerTipoClientes() {
		return dao.traerTipoClientes();
	}

}

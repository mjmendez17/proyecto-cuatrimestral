package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;
import datos.TipoCliente;

public class ClienteABM {

	ClienteDao dao = new ClienteDao();

	public Cliente traerCliente(int idCliente) {
		Cliente c = dao.traerCliente(idCliente);

		return c;
	}

	public int agregar(String nombre, String apellido, int dni, GregorianCalendar fechaDeNacimiento, String email,
			TipoCliente tipoCliente) {

		Cliente c = new Cliente(nombre, apellido, dni, email, fechaDeNacimiento, tipoCliente);
		return dao.agregar(c);
	}

	public void modificar(Cliente c) {

		dao.actualizar(c);
	}

	public void eliminar(int idCliente) {

		Cliente c = dao.traerCliente(idCliente);

		dao.eliminar(c);
	}

	public List<Cliente> traerClientes() {
		return dao.traerClientes();
	}

}

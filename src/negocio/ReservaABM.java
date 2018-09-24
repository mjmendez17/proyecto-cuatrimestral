package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ReservaDao;
import datos.Butaca;
import datos.Cliente;
import datos.Funcion;
import datos.Reserva;
import datos.Usuario;

public class ReservaABM {

	ReservaDao dao = new ReservaDao();

	public Reserva traerReserva(int idReserva) {
		Reserva c = dao.traerReserva(idReserva);

		return c;
	}

	public int agregar(String codigoReserva, Funcion funcion, Cliente cliente, Butaca butaca, Usuario usuario) {

		Reserva c = new Reserva(codigoReserva, funcion, cliente, butaca, usuario);
		return dao.agregar(c);
	}

	public void modificar(Reserva c) {

		dao.actualizar(c);
	}

	public void eliminar(int idReserva) {

		Reserva c = dao.traerReserva(idReserva);

		dao.eliminar(c);
	}

	public List<Reserva> traerReservas() {
		return dao.traerReservas();
	}

}

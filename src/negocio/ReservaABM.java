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

	public Reserva traerReserva(long idReserva) {
		Reserva c = dao.traerReserva(idReserva);

		return c;
	}

	public int agregar(String codigoReserva, float precio, Funcion funcion, Cliente cliente, Usuario usuario,
			GregorianCalendar fechaHora) {

		Reserva c = new Reserva(codigoReserva, precio, funcion, cliente, usuario, fechaHora);
		return dao.agregar(c);
	}

	public void modificar(Reserva c) {

		dao.actualizar(c);
	}

	public void eliminar(long idReserva) {

		Reserva c = dao.traerReserva(idReserva);

		dao.eliminar(c);
	}

	public List<Reserva> traerReservas() {
		return dao.traerReservas();
	}

}

package negocio;

import java.util.List;

import dao.EventoDao;
import datos.Evento;

public class EventoABM {

	EventoDao dao = new EventoDao();

	public Evento traerEvento(long idEvento) throws Exception {
		Evento c = dao.traerEvento(idEvento);
		if (dao.traerEvento(idEvento) == null)
			throw new Exception("Id incorrecto: la Evento no existe");
		return c;
	}

	public int agregar(Evento evento) {
		return dao.agregar(evento);

	}

	public void modificar(Evento c) throws Exception {
		if ((dao.traerEvento(c.getIdEvento()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idEvento) throws Exception {
		Evento c = dao.traerEvento(idEvento);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Evento no existe para eliminar");
	}

	public List<Evento> traerEvento() throws Exception {
		if (dao.traerEvento() != null) {
			return dao.traerEvento();
		} else
			throw new Exception("No hay Eventos en la base de datos");
	}

}

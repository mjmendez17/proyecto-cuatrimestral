package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import datos.Reserva;
import datos.Reserva;

@SuppressWarnings("unused")
public class ReservaDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {

		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {

		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////

	// Traer Reserva por ID
	public Reserva traerReserva(int idReserva) throws HibernateException {

		Reserva objeto = null;

		try {
			iniciaOperacion();
			objeto = (Reserva) session.get(Reserva.class, idReserva);

		} finally {
			session.close();
		}

		return objeto;
	}

	public int agregar(Reserva objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(Reserva objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {

			session.close();
		}
	}

	public void eliminar(Reserva objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public List<Reserva> traerReservas() throws HibernateException {
		List<Reserva> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Reserva c order by c.apellido asc c.nombre asc").list();
		} finally {
			session.close();

		}
		return lista;
	}
}

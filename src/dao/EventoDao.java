package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Evento;

public class EventoDao {

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

	public Evento traerEvento(long idEvento) throws HibernateException {
		Evento objeto = null;
		try {
			iniciaOperacion();
			objeto = (Evento) session.get(Evento.class, idEvento);
		} finally {
			session.close();
		}
		return objeto;
	}

	public int agregar(Evento objeto) throws HibernateException {
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

	public void eliminar(Evento objeto) throws HibernateException {
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

	@SuppressWarnings("unchecked")
	public List<Evento> traerEvento() {
		List<Evento> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Categoria c order by c.idCategoria asc ").list();
		} finally {
			session.close();
		}
		return lista;
	}

	public void actualizar(Evento objeto) throws HibernateException {
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

}

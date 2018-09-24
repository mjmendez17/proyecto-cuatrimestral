package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Estadio;

public class EstadioDao {

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

	public Estadio traerEstadio(long idEstadio) throws HibernateException {
		Estadio objeto = null;
		try {
			iniciaOperacion();
			objeto = (Estadio) session.get(Estadio.class, idEstadio);
		} finally {
			session.close();
		}
		return objeto;
	}

	public int agregar(Estadio objeto) throws HibernateException {
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

	public void eliminar(Estadio objeto) throws HibernateException {
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
	public List<Estadio> traerEstadio() {
		List<Estadio> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Categoria c order by c.idCategoria asc ").list();
		} finally {
			session.close();
		}
		return lista;
	}

	public void actualizar(Estadio objeto) throws HibernateException {
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

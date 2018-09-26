package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import datos.Descuento;
import datos.Descuento;

@SuppressWarnings("unused")
public class DescuentoDao {

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

	// Traer Descuento por String
	public Descuento traerDescuento(long idDescuento) throws HibernateException {

		Descuento objeto = null;

		try {
			iniciaOperacion();
			objeto = (Descuento) session.get(Descuento.class, idDescuento);

		} finally {
			session.close();
		}

		return objeto;
	}

	public int agregar(Descuento objeto) {
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

	public void actualizar(Descuento objeto) throws HibernateException {
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

	public void eliminar(Descuento objeto) throws HibernateException {
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

	public List<Descuento> traerDescuentos() throws HibernateException {
		List<Descuento> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Descuento c order by c.apellido asc c.nombre asc").list();
		} finally {
			session.close();

		}
		return lista;
	}

}

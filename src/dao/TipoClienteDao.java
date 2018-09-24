package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import datos.TipoCliente;

@SuppressWarnings("unused")
public class TipoClienteDao {

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

	// Traer TipoTipoCliente por ID
	public TipoCliente traerTipoTipoCliente(int idTipoCliente) throws HibernateException {

		TipoCliente objeto = null;

		try {
			iniciaOperacion();
			objeto = (TipoCliente) session.get(TipoCliente.class, idTipoCliente);

		} finally {
			session.close();
		}

		return objeto;
	}

	public int agregar(TipoCliente objeto) {
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

	public void actualizar(TipoCliente objeto) throws HibernateException {
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

	public void eliminar(TipoCliente objeto) throws HibernateException {
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

	public TipoCliente traerTipoCliente(int idTipoCliente) throws HibernateException {
		TipoCliente objeto = null;
		try {
			iniciaOperacion();
			objeto = (TipoCliente) session.createQuery("from TipoCliente c where c.dni=" + idTipoCliente)
					.uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	public List<TipoCliente> traerTipoClientes() throws HibernateException {
		List<TipoCliente> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from TipoCliente c order by c.apellido asc c.nombre asc").list();
		} finally {
			session.close();

		}
		return lista;
	}

}

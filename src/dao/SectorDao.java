package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Sector;

public class SectorDao {

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

	public Sector traerSector(long idSector) throws HibernateException {
		Sector objeto = null;
		try {
			iniciaOperacion();
			objeto = (Sector) session.get(Sector.class, idSector);
		} finally {
			session.close();
		}
		return objeto;
	}

	public int agregar(Sector objeto) throws HibernateException {
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

	public void eliminar(Sector objeto) throws HibernateException {
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
	public List<Sector> traerSector() {
		List<Sector> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Categoria c order by c.idCategoria asc ").list();
		} finally {
			session.close();
		}
		return lista;
	}

	public void actualizar(Sector objeto) throws HibernateException {
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

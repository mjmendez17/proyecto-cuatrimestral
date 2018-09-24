package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Rol;
import datos.Usuario;

public class RolDao {
	private static Session session ;
	private Transaction tx ;
	
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil. getSessionFactory ().openSession();
		tx = session .beginTransaction();
	}
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx .rollback();
		throw new HibernateException( "ERROR en la capa de acceso a datos" , he);
	}
	public int agregar(Rol objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt( session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
		session .close();
		}
	return id;
	}
	public void actualizar(Rol objeto) throws HibernateException {
	try {
	iniciaOperacion();
	session .update(objeto);
	tx .commit();
	} catch (HibernateException he) {
	manejaExcepcion(he);
	throw he;
	} finally {
	session .close();
	}
	}
	public void eliminar(Rol objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session .delete(objeto);
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
		session .close();
		}
	}
	public Rol traerRol( long idRol) throws HibernateException {
		Rol objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Rol) session .get(Rol. class , idRol);
		} finally {
		session .close();
		}
		return objeto;
	}
	
	/*public Usuario traerCliente( String nombreRol) throws HibernateException {
		Usuario objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Usuario) session.createQuery( "from Cliente c where c.dni=" +dni).uniqueResult();
		}finally {
			session .close();
		}
	return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<Usuario> traerCliente() throws HibernateException {
	List<Usuario> lista= null ;
	try {
		iniciaOperacion();
		lista= session .createQuery( "from Cliente c order by c.apellido asc c.nombre asc" ).list();
	} finally{
		session .close();
	}
	return lista;
	}*/

}

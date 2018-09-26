package negocio;

import java.util.List;

import dao.UsuarioDao;
import datos.Usuario;
import datos.Usuario;

public class UsuarioABM {

	private UsuarioDao dao;

	public Usuario traerUsuario(long idUsuario) throws Exception {
		Usuario u = dao.traerUsuario(idUsuario);
		if (u == null)
			throw new Exception("El Usuario no Existe");
		return dao.traerUsuario(idUsuario);
	}

	public long agregar(Usuario Usuario) {
		return dao.agregar(Usuario);

	}

	public void modificar(Usuario c) throws Exception {
		if ((dao.traerUsuario(c.getIdUsuario()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idUsuario) throws Exception {
		Usuario c = dao.traerUsuario(idUsuario);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Usuario no existe para eliminar");
	}

	public List<Usuario> traerUsuario() throws Exception {
		if (dao.traerUsuarios() != null) {
			return dao.traerUsuarios();
		} else
			throw new Exception("No hay Usuarios en la base de datos");
	}

}

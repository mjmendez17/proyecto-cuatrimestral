package negocio;

import dao.UsuarioDao;
import datos.Usuario;

public class UsuarioABM {
	
	private UsuarioDao dao ; 
	
	public Usuario traerUsuario(long idUsuario)throws Exception {
		Usuario u = dao.traerUsuario(idUsuario);
		if(u==null) throw new Exception("El Usuario no Existe");
		return dao.traerUsuario(idUsuario);
	}
	
	
	
	
}

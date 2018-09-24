package negocio;


import dao.RolDao;
import datos.Rol;

public class RolABM {
	
	private RolDao dao;
	
	public Rol traerRol(long idRol)throws Exception {
		Rol r = dao.traerRol(idRol);
		if(r==null) throw new Exception("El Rol no Existe");
		return dao.traerRol(idRol);
	}
	
	/*public void agregarRol(String nombreRol)throws Exception{
		Rol r = dao.traerRol(nombreRol);
		if(r!=null) throw new Exception("El dni Ya Existe");
		dao.agregar(new Rol(nombreRol));
	}*/
	
	
}

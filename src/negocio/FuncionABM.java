package negocio;

import dao.FuncionDao;
import datos.Funcion;


public class FuncionABM {
	
	private FuncionDao dao;
	
	public Funcion traerFuncion(long idFuncion)throws Exception {
		Funcion f = dao.traerFuncion(idFuncion);
		if(f==null) throw new Exception("La Funcion no Existe");
		return dao.traerFuncion(idFuncion);
	}
	
}

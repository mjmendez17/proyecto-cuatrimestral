package negocio;

import java.util.List;

import dao.AuditorioDao;
import datos.Auditorio;

public class AuditorioABM {

	AuditorioDao dao = new AuditorioDao();

	public Auditorio traerAuditorio(long idAuditorio) throws Exception {
		Auditorio c = dao.traerAuditorio(idAuditorio);
		if (dao.traerAuditorio(idAuditorio) == null)
			throw new Exception("Id incorrecto: la Auditorio no existe");
		return c;
	}

	public int agregar(Auditorio auditorio) {
		return dao.agregar(auditorio);

	}

	public void modificar(Auditorio c) throws Exception {
		if ((dao.traerAuditorio(c.getIdAuditorio()) != null)) {
			dao.actualizar(c);
		} else
			throw new Exception("No existe el ID");
	}

	public void eliminar(long idAuditorio) throws Exception {
		Auditorio c = dao.traerAuditorio(idAuditorio);
		if (c != null) {
			dao.eliminar(c);
		} else
			throw new Exception("Auditorio no existe para eliminar");
	}

	public List<Auditorio> traerAuditorio() throws Exception {
		if (dao.traerAuditorio() != null) {
			return dao.traerAuditorio();
		} else
			throw new Exception("No hay Auditorios en la base de datos");
	}

}

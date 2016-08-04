package la.netco.suscripcion.service;

import java.util.List;

import la.netco.suscripcion.dto.TipoDocumentoTO;
import la.netco.suscripcion.exceptions.PersistenceException;

public interface TipoDocumentoService {

	List<TipoDocumentoTO> obtenerTipoDocumentos() throws PersistenceException;

	TipoDocumentoTO obtenerTipoDocumento(int id_tipo_doc) throws PersistenceException;

}

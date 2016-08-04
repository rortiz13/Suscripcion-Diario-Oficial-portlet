package la.netco.suscripcion.service;

import la.netco.suscripcion.dto.SuscripcionTO;
import la.netco.suscripcion.exceptions.PersistenceException;

public interface SuscripcionService {

	SuscripcionTO guardarSuscripcion(SuscripcionTO suscripcionTO) throws PersistenceException;

	boolean existeSuscripcionDocumento(String numDocumento);

}

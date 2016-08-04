package la.netco.suscripcion.service;

import java.util.List;

import la.netco.suscripcion.dto.CiudadTO;
import la.netco.suscripcion.dto.DepartamentoTO;
import la.netco.suscripcion.dto.PaisTO;
import la.netco.suscripcion.exceptions.PersistenceException;

public interface CiudadService {

	List<PaisTO> obtenerPaises() throws PersistenceException;

	List<DepartamentoTO> obtenerDepartamentos(int idPais) throws PersistenceException;

	List<CiudadTO> obtenerCiudades(int idDept) throws PersistenceException;

	PaisTO obtenerPais(int id_pais) throws PersistenceException;

	DepartamentoTO obtenerDeparamento(int id_dept) throws PersistenceException;

	CiudadTO obtenerCiudad(int id_ciudad) throws PersistenceException;

}
